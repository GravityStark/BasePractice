package com.lw;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class ThreadPoolService {
    private void init(){
        ScheduledExecutorService scheduledExecutorService =  Executors.newScheduledThreadPool(1);
    }
}
