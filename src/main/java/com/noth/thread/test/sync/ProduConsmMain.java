package com.noth.thread.test.sync;

import com.noth.thread.common.sync.Consumer;
import com.noth.thread.common.sync.EventStorage;
import com.noth.thread.common.sync.Producer;

/**
 * Created by thway on 2017/5/12.
 * 生产者消费者测试
 * 测试wait.notify.notifyAll.
 */
public class ProduConsmMain {


    public static void main(String[] args) {
        EventStorage storage = new EventStorage();

        Producer producer = new Producer(storage);
        Thread thread1 = new Thread(producer);

        Consumer consumer = new Consumer(storage);
        Thread thread2 = new Thread(consumer);

        thread2.start();
        thread1.start();
    }
}
