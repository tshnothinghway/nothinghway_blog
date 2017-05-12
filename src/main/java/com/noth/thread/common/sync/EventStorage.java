package com.noth.thread.common.sync;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by thway on 2017/5/12.
 * 数据缓存区
 * 共享数据
 * maxSize最大值
 * list<Date> 数据
 */
public class EventStorage {

    private int maxSize;
    private List<Date> storage;

    public  EventStorage() {
        maxSize = 10;
        storage = new LinkedList<>();
    }

    /**
     *   生产产品。并通知消费者消费
     */
    public synchronized void set() {
        while (storage.size() == maxSize) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        storage.add(new Date());
        System.out.printf("Set : %d\n ",storage.size());
        notifyAll();
    }


    public synchronized void get() {
        while (storage.size() == 0 ) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.printf("Get :%d :%s\n",storage.size(),((LinkedList<?>)storage).poll());
        notifyAll();
    }

}
