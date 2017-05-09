package com.noth.thread.common.base;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by thway on 2017/5/9.
 */
public class FileClock implements Runnable{

    //休眠-挂起线程
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("%s\n",new Date());
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                System.out.println("The thread has been interrupted.");
            }
        }
    }
}
