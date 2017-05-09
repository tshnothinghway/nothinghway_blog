package com.noth.thread.common.base;

/**
 * Created by thway on 2017/5/9.
 * 简单实现多线程
 */
public class Calculator implements Runnable{

    private  int number;

    public Calculator(int number) {
        this.number = number;
    }

    //注意：当所有的非守护线程结束 则程序（进程）结束
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("%s : %d * %d = %d\n",Thread.currentThread().getName(),number,i,i*number);
        }

    }
}
