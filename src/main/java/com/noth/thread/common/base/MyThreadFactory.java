package com.noth.thread.common.base;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ThreadFactory;

/**
 * Created by thway on 2017/5/10.
 */
public class MyThreadFactory  implements ThreadFactory{

    private  int counter;
    private String name ;
    private List<String> stats;

    public MyThreadFactory(String name) {
        counter = 0;
        stats = new ArrayList<>();
        this.name = name;
    }

    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r,name+ "-Thread_"+counter);
        counter ++;
        stats.add("Created Thread :" +Thread.currentThread().getName()+":"+new Date());
        return t;
    }
}
