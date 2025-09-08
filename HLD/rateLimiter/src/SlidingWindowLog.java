import java.time.Instant;
import java.util.LinkedList;
import java.util.Queue;

public class SlidingWindowLog {
    private long windowSizeInMillis;
    private long maximumRequestsAllowedPerWindow;
    private Queue<Long>  requestLog;
    public SlidingWindowLog(long windowSizeInMillis, long maximumRequestsAllowedPerWindow){
        this.windowSizeInMillis = windowSizeInMillis;
        this.maximumRequestsAllowedPerWindow=maximumRequestsAllowedPerWindow;
        this.requestLog=new LinkedList<>();
    }
    public synchronized boolean allowRequest(){
        long currentTime= Instant.now().getEpochSecond();
        long windowStartTime=currentTime- windowSizeInMillis;
        while (!requestLog.isEmpty() && requestLog.peek()<=windowStartTime){
            requestLog.poll();
        }
        if (requestLog.size()<maximumRequestsAllowedPerWindow){
            requestLog.offer(currentTime);
            return true;
        }
        return false;
    }
}

