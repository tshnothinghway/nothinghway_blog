package com.noth.thread.common.lock;

/**
 * Created by thway on 2017/5/12.
 */
public class Job implements Runnable{

    private PrintQueue printQueue;

    public Job(PrintQueue printQueue) {
        this.printQueue = printQueue;
    }

    @Override
    public void run() {

        System.out.printf("%s Going to print a document:\n",Thread.currentThread().getName());

        printQueue.printJob(new Object());

        System.out.printf("%s The document has printed:\n",Thread.currentThread().getName());
    }
}
