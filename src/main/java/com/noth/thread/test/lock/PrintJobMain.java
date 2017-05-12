package com.noth.thread.test.lock;

import com.noth.thread.common.lock.Job;
import com.noth.thread.common.lock.PrintQueue;

/**
 * Created by thway on 2017/5/12.
 */
public class PrintJobMain {

    public static void main(String[] args) {
        PrintQueue queue = new PrintQueue();
        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(new Job(queue));
        }
        for (int i = 0; i < 10; i++) {
            threads[i].start();
        }
    }
}
