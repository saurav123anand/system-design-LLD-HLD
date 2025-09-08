import java.time.Instant;
import java.util.*;
public class LeakyBucket {
    private long capacity; // maximum requests bucket can hold
    private Queue<Instant> queue; // total requests in the queue- queue to hold timestamps of requests
    private long leakRate;
    private long lastLeakedTime;

    public LeakyBucket(final long capacity,final long leakRate){
        this.capacity=capacity;
        this.queue=new LinkedList<>();
        this.leakRate=leakRate;
        this.lastLeakedTime=System.nanoTime();
    }

    // create a method to handle the request
    public synchronized boolean handLeRequest(){
        leak();
        if (queue.size()<this.capacity){
            queue.offer(Instant.now());// add new request to the bucket
            return true;
        }
        return false;
    }

    // create a method to leak the requests
    private void leak() {
        long currentTime=System.nanoTime();
        // requests to be dropped based on the elapsed time
        int toBeLeaked = (int)((currentTime - lastLeakedTime) * leakRate / 1_000_000_000);
        // start leaking the processed request based on the leak rate
        for(int i=0;i<toBeLeaked && !queue.isEmpty();i++){
            queue.poll();
        }
        this.lastLeakedTime=currentTime;
    }

}