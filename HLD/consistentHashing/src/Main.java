import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ConsistentHashing consistentHashing = new ConsistentHashing(Arrays.asList("server1", "server2", "server3"), 3);
        System.out.println(consistentHashing.getServer("key1"));
        consistentHashing.addServer("server4");
        System.out.println(consistentHashing.getServer("key2"));
        consistentHashing.removeServer("server2");
        consistentHashing.removeServer("server3");
        consistentHashing.removeServer("server1");
        consistentHashing.removeServer("server4");
        System.out.println(consistentHashing.getServer("key3"));
    }
}
