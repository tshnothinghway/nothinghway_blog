package com.noth.thread.common.base;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by thway on 2017/5/9.
 */
public class DataSourceLoader implements  Runnable{

    @Override
    public void run() {
        System.out.printf("Beginning data sources loading :%s\n",new Date());
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("Data sources has finished :%s\n",new Date());
    }
}
