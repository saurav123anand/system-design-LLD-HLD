public class TokenBucket {
    private long capacity; // maximum capacity of the bucket
    private double currentTokens; // total number of tokens present in the bucket currently
    private long refillRate;// refill rate per second
    private long lastRefilledTime;

    public TokenBucket(final long capacity, final double currentTokens, final long refillRate){
        this.capacity=capacity;
        this.currentTokens=currentTokens;
        this.refillRate=refillRate;
        this.lastRefilledTime=System.nanoTime();
    }

    // create a method to handle the request
    public synchronized boolean handleRequest(int tokens){
        refill();
        if(tokens<=currentTokens){
            this.currentTokens-=tokens;
            return true;
        }
        return false;
    }
    // create a method for refilling the bucket
    public synchronized void refill(){
        long currentTime=System.nanoTime();
        // how many tokens need to be added based on the elapsed tine
        double tokensTobeAdded=(currentTime-lastRefilledTime)*refillRate/1_000_000_000.0;
        this.currentTokens=Math.min(this.capacity,this.currentTokens+tokensTobeAdded);
        this.lastRefilledTime=currentTime;
    }

}
