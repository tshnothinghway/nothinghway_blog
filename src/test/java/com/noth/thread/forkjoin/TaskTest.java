package com.noth.thread.forkjoin;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;


/**
 * Created by thway on 2017/4/25.
 */
public class TaskTest {

    public static void main(String[] args) {
        //随机生成一万个产品
        ProductListGenerator generator = new ProductListGenerator();
        List<Product> products = generator.generate(10000);

        Task task = new Task(products,0, products.size(),0.2);

        ForkJoinPool pool = new ForkJoinPool();

        pool.execute(task);
        do{
            System.out.printf("Main : Thread count : %d\n" ,pool.getActiveThreadCount());
            System.out.printf("Main : Thread steal : %d\n",pool.getStealCount());
            System.out.printf("Main : Thread parallelism :%d\n" ,pool.getParallelism());
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (!task.isDone());

        pool.shutdown();
        for (int i = 0 ; i < products.size() ; i ++){
            System.out.println("Product"+i +"price :"+products.get(i).getPrice());
        }
    }

}