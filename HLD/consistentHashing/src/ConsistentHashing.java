import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ConsistentHashing {
    private final int numReplicas; // number of virtual nodes per server
    private final TreeMap<Long,String> ring; // Hash ring storing virtual nodes
    private final Set<String> servers; // set of physical servers
    public ConsistentHashing(List<String> servers, int numReplicas) {
        this.numReplicas = numReplicas;
        this.servers = new HashSet<>();
        this.ring = new TreeMap<>();
        // Add each server to the hash ring
        for (String server:servers){
            addServer(server);
        }
    }

    private long hash(String key) {
        try {
            MessageDigest md=MessageDigest.getInstance("MD5");
            md.update(key.getBytes());
            byte[] digest=md.digest();
            return ((long) (digest[0] & 0xFF) << 24) |
                    ((long) (digest[1] & 0xFF) << 16) |
                    ((long) (digest[2] & 0xFF) << 8) |
                    ((long) (digest[3] & 0xFF));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("MD5 algorithm not found", e);
        }

    }

    public void addServer(String server) {
      servers.add(server);
      for (int i = 0; i < numReplicas; i++) {
          long hash = hash(server + "-" + i); // Unique hash for each virtual node
          ring.put(hash, server);
      }
    }
    public void removeServer(String server) {
        if (servers.remove(server)) {
            for (int i = 0; i < numReplicas; i++) {
                long hash = hash(server + "-" + i);
                ring.remove(hash);
            }
        }
    }
    public String getServer(String key) {
        if (ring.isEmpty()) {
            return null; // no servers available
        }
        long hash = hash(key);
        // find the closest server in the hash ring
        Map.Entry<Long, String> entry = ring.ceilingEntry(hash);
        if (entry == null) {
            // If we exceed the highest node, wrap around to the first node
            entry = ring.firstEntry();
        }
        return entry.getValue();
    }


}