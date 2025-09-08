import java.time.Instant;

public class FixedWindowCounter {
    private long windowsSizeInSeconds;
    private long maximumRequestAllowedPerWindow;
    private long requestCountInCurrentWindow;
    private long currentWindowStartTimeInSecond;
    public FixedWindowCounter(long windowsSizeInSeconds,long maximumRequestAllowedPerWindow){
        this.windowsSizeInSeconds=windowsSizeInSeconds;
        this.maximumRequestAllowedPerWindow=maximumRequestAllowedPerWindow;
        this.currentWindowStartTimeInSecond=Instant.now().toEpochMilli();
        this.requestCountInCurrentWindow=0;
    }

    public synchronized String allowRequest(){
        long currentTime=Instant.now().toEpochMilli();
        if (currentTime-currentWindowStartTimeInSecond>=windowsSizeInSeconds){
            // start new window
            currentWindowStartTimeInSecond=currentTime;
            requestCountInCurrentWindow=0;
        }
        if (requestCountInCurrentWindow<maximumRequestAllowedPerWindow){
            requestCountInCurrentWindow++;
            return "request allowed";
        }
        return "request denied";
    }
}
