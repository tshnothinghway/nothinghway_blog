package com.noth.thread.common.sync;

/**
 * Created by thway on 2017/5/12.
 */
public class Consumer implements  Runnable{

    private EventStorage storage;

    public Consumer(EventStorage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            storage.get();
        }
    }
}
