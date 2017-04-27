package com.noth.thread.forkjoin;

import java.util.List;
import java.util.concurrent.RecursiveAction;

/**
 * Created by thway on 2017/4/25.
 */
public class Task extends RecursiveAction{

    private static final long serialVersionUID = 1L;

    private List<Product> products;

    private  int first;

    private  int last;

    private double increment;

    public Task(List<Product> products, int first, int last, double increment) {
        this.products = products;
        this.first = first;
        this.last = last;
        this.increment = increment;
    }

    //更新订单价格
    private void updatePrices(){
        for (int i = first ; i < last ; i ++){
            Product product = products.get(i);
            product.setPrice(product.getPrice()*(1 + increment));
        }
    }


    //重写方法 进行拆分
    @Override
    protected void compute() {

        if(last - first < 10) {
            updatePrices();
        } else {
            int middle = (last + first)/2;
            System.out.printf("Task :Pending tasks :%s\n",getQueuedTaskCount());
            Task t1 = new Task(products,first,middle+1,increment);
            Task t2 = new Task(products,middle+1,last,increment);
            invokeAll(t1,t2);
        }

    }
}
