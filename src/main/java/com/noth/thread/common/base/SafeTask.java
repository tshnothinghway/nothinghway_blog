package com.noth.thread.common.base;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by thway on 2017/5/9.
 */
public class SafeTask  implements  Runnable{

    private ThreadLocal<Date> startDate = new ThreadLocal<Date>(){
        protected Date initialValue(){
            return new Date();
        }
    };
    @Override
    public void run() {
        System.out.printf("Starting Thread : %s : %s \n",Thread.currentThread().getId(),startDate.get());
        try {
            TimeUnit.SECONDS.sleep((int)Math.rint(Math.random()*10));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("Stopping Thread %s : %s \n", Thread.currentThread().getId(), startDate.get());

    }
}
