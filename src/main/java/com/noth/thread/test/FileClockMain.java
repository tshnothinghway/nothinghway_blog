package com.noth.thread.test;

import com.noth.thread.common.base.FileClock;

import java.util.concurrent.TimeUnit;

/**
 * Created by thway on 2017/5/9.
 */
public class FileClockMain {

    public static void main(String[] args) {
        FileClock fileClock = new FileClock();
        Thread thread = new Thread(fileClock);
        thread.start();

        try {
            TimeUnit.SECONDS.sleep(5);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
    }
}
