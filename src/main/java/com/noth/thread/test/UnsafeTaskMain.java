package com.noth.thread.test;

import com.noth.thread.common.base.SafeTask;
import com.noth.thread.common.base.UnsafeTask;

import java.util.concurrent.TimeUnit;

/**
 * Created by thway on 2017/5/9.
 */
public class UnsafeTaskMain {

    /**public static void main(String[] args) {
        UnsafeTask task = new UnsafeTask();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(task);
            thread.start();
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    } **/
    public static void main(String[] args) {
        SafeTask task = new SafeTask();
        for (int i = 0; i < 10; i++) {
             Thread thread = new Thread(task);
             thread.start();
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
