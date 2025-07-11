# Consistent Hashing Implementation

This is a Java implementation of the Consistent Hashing algorithm, a distributed hashing scheme that minimizes reorganization when nodes are added or removed from a cluster.

## Table of Contents
- [Overview](#overview)
- [Key Features](#key-features)
- [How It Works](#how-it-works)
- [Implementation Details](#implementation-details)
- [Usage Example](#usage-example)
- [Performance](#performance)
- [Use Cases](#use-cases)

## Overview

Consistent Hashing is a distributed hashing technique used in distributed systems to distribute keys across multiple servers while minimizing the number of keys that need to be remapped when servers are added or removed.

## Key Features

- **Load Distribution**: Evenly distributes keys across servers
- **Minimal Rehashing**: Only k/n keys need to be remapped when a server is added or removed (where k is the number of keys and n is the number of servers)
- **Virtual Nodes**: Uses virtual nodes (replicas) to ensure better load balancing
- **Efficient Lookup**: O(log n) time complexity for both insertions and lookups

## How It Works

1. **Hash Ring**: All servers and keys are hashed onto a circular ring
2. **Virtual Nodes**: Each physical server is represented by multiple virtual nodes on the ring
3. **Key Assignment**: A key is assigned to the first server whose hash is greater than the key's hash (moving clockwise)
4. **Wrap-Around**: If no server is found with a higher hash, it wraps around to the first server

## Implementation Details

### Data Structures
- `TreeMap<Long, String> ring`: Maps hash values to server names
- `Set<String> servers`: Tracks active physical servers
- `int numReplicas`: Number of virtual nodes per physical server

### Core Methods

#### `hash(String key)`
- Uses MD5 hashing to convert strings into 32-bit integers
- Ensures even distribution of keys across the hash ring

#### `addServer(String server)`
1. Adds the server to the set of active servers
2. Creates `numReplicas` virtual nodes by appending a number to the server name
3. Hashes each virtual node and adds it to the ring

#### `removeServer(String server)`
1. Removes the server from the set of active servers
2. Removes all virtual nodes associated with the server from the ring

#### `getServer(String key)`
1. Hashes the key
2. Finds the first server with a hash ≥ the key's hash using `ceilingEntry()`
3. If no such server exists, wraps around to the first server in the ring

## Usage Example

```java
public class Main {
    public static void main(String[] args) {
        // Initialize with 3 servers and 3 virtual nodes per server
        ConsistentHashing ch = new ConsistentHashing(
            Arrays.asList("server1", "server2", "server3"), 
            3
        );

        // Get server for a key
        String key1 = "user123";
        String server = ch.getServer(key1);
        System.out.println("Key '" + key1 + "' is assigned to: " + server);

        // Add a new server
        ch.addServer("server4");
        
        // Remove a server
        ch.removeServer("server2");
    }
}
```

## Performance

- **Time Complexity**:
  - Add/Remove Server: O(k log n) where k is number of replicas and n is number of virtual nodes
  - Get Server: O(log n) where n is number of virtual nodes
- **Space Complexity**: O(k × n) where k is number of replicas and n is number of servers

## Use Cases

1. **Distributed Caching**: Used in systems like Memcached, Redis Cluster
2. **Load Balancing**: For distributing requests across multiple servers
3. **Content Delivery Networks (CDNs)**: To route requests to the nearest server
4. **Distributed Databases**: For sharding data across multiple nodes

## Advantages

- **Scalability**: Easy to add/remove servers with minimal data movement
- **Fault Tolerance**: Handles server failures gracefully
- **Load Balancing**: Even distribution of keys across servers
- **Consistency**: Minimal redistribution of keys when servers are added/removed

## Limitations

- **Memory Usage**: Each virtual node consumes memory
- **Non-Uniform Distribution**: With small number of servers/virtual nodes, distribution might not be perfectly even
- **Hotspots**: Certain ranges of the hash space might get more keys than others

## References
- [Consistent Hashing - Wikipedia](https://en.wikipedia.org/wiki/Consistent_hashing)
- [Consistent Hashing and Random Trees](https://www.akamai.com/us/en/multimedia/documents/technical-publication/consistent-hashing-and-random-trees-distributed-caching-protocols-for-relieving-hot-spots-on-the-world-wide-web-technical-publication.pdf) (Original Paper)
