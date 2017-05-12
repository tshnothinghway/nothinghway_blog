package com.noth.thread.common.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by thway on 2017/5/12.
 */
public class PrintQueue {

    private final Lock queueLock = new ReentrantLock();

    public void  printJob(Object document) {
        queueLock.lock();
        Long duration = (long) (Math.random()*10000);
        System.out.println(Thread.currentThread().getName()+": PrintQueue:Printing a job during"
            +(duration/1000)+" seconds"
        );
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            queueLock.unlock();
        }
    }
}
