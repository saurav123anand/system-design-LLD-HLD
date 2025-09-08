public class  SlidingWindowCounter {
    private final long windowSizeInMillis;
    private final long maxRequestsPerWindow;
    private long currentWindowStart;
    private long previousWindowCount;
    private long currentWindowCount;
    public SlidingWindowCounter(long windowSizeInSeconds, long maxRequestsPerWindow){
        this.windowSizeInMillis = windowSizeInSeconds * 1000L;
        this.maxRequestsPerWindow = maxRequestsPerWindow;
        this.currentWindowStart= System.currentTimeMillis();
        this.previousWindowCount=0;
        this.currentWindowCount=0;
    }
    public synchronized boolean allowRequest() {
        long currentTime = System.currentTimeMillis();
        long timePassed = currentTime - currentWindowStart;
        if (timePassed >= windowSizeInMillis) {
            if (timePassed >= 2 * windowSizeInMillis) {
                previousWindowCount = 0; // clean slate counts
            } else {
                previousWindowCount = currentWindowCount;
            }
            currentWindowCount = 0;
            currentWindowStart = currentTime;
            timePassed = 0;
        }
        double previousWindowWeightage = ((windowSizeInMillis - timePassed) / (double) windowSizeInMillis) * previousWindowCount;
        double totalWeightage = previousWindowWeightage + currentWindowCount;
        if (totalWeightage < maxRequestsPerWindow) {
            currentWindowCount++;
            return true;
        }
        return false;
    }
}
