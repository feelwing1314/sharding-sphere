package com.saaavsaaa.client.retry;

/**
 * Created by aaa
 */
public class DelayRetry {
    private static final long BASE_DELAY = 10;
    private static final int BASE_COUNT = 3;
    private static final int RETRY_COUNT_BOUND = 29;
    
    private final int retryCount;
    private final long baseDelay;
    private final long delayUpperBound;
    
    /*
    * Millis
    */
    public DelayRetry(long baseDelay) {
        this(RETRY_COUNT_BOUND, baseDelay, Integer.MAX_VALUE);
    }
    
    public DelayRetry(int retryCount, long baseDelay, long delayUpperBound) {
        this.retryCount = retryCount;
        this.baseDelay = baseDelay;
        this.delayUpperBound = delayUpperBound;
    }
    
    public int getRetryCount() {
        return retryCount;
    }
    
    public long getBaseDelay() {
        return baseDelay;
    }
    
    public long getDelayUpperBound() {
        return delayUpperBound;
    }
    
    public static DelayRetry newNoInitDelayRetrial(){
        return new DelayRetry(BASE_COUNT, BASE_DELAY, BASE_DELAY);
    }
}
