package com.noth.thread.test;

import com.noth.thread.common.base.PrimeGenerator;

/**
 * Created by thway on 2017/5/9.
 *
 */
public class PrimeGeneratorMain {
    public static void main(String[] args) {
        Thread thread = new PrimeGenerator();
        thread.start();
        try {
            Thread.sleep(5000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
    }
}
