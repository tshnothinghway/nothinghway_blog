package com.noth.thread.common.base;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by thway on 2017/5/9.
 */
public class UnsafeTask implements Runnable {
    private Date startTime;

    @Override
    public void run() {
        startTime = new Date();
        System.out.printf("Starting Thread : %s : %s \n",Thread.currentThread().getId(),startTime);

        try {
            TimeUnit.SECONDS.sleep((int)Math.rint(Math.random()*10));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("Stopping Thread %s : %s \n", Thread.currentThread().getId(), startTime);
    }
}
