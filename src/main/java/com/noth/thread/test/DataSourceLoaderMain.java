package com.noth.thread.test;

import com.noth.thread.common.base.DataSourceLoader;
import com.noth.thread.common.base.NetWorkConnectionsLoader;
import com.rabbitmq.client.impl.NetworkConnection;

/**
 * Created by thway on 2017/5/9.
 */
public class DataSourceLoaderMain {
    public static void main(String[] args) {
        DataSourceLoader dataSourceLoader = new DataSourceLoader();
        Thread thread1 = new Thread(dataSourceLoader,"DataSourceLoader");

        NetWorkConnectionsLoader ncloader = new NetWorkConnectionsLoader();
        Thread thread2 = new Thread(ncloader,"NetWorkConnectionsLoader");
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("The main starting close ...");
    }


}
