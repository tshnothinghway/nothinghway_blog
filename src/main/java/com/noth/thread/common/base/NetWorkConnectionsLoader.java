package com.noth.thread.common.base;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by thway on 2017/5/9.
 */
public class NetWorkConnectionsLoader implements Runnable{


    @Override
    public void run() {
        System.out.printf("Beginning net_work_connection loading :%s\n",new Date());
        try {
            TimeUnit.SECONDS.sleep(8);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("net_work_connection has finished :%s\n",new Date());
    }
}
