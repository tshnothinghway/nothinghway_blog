package com.noth.thread.test;

import com.noth.thread.common.base.Calculator;

/**
 * Created by thway on 2017/5/9.
 */
public class CalculatorMain {

    public static void main(String[] args) {
      Thread[] threads = new Thread[10];
      Thread.State state[] = new Thread.State[10];
      for (int i = 0 ; i< 10 ; i++) {
          threads[i] = new Thread(new Calculator(i));
          if ((i%2)==0) {
              threads[i].setPriority(Thread.MAX_PRIORITY);
          } else {
              threads[i].setPriority(Thread.MIN_PRIORITY);
          }
          threads[i].setName("Thread "+i);
      }
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() +":state:"+threads[i].getState());
        }
        for (int i = 0; i < 10; i++) {
            threads[i].start();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() +":state:"+threads[i].getState());
        }
    }
}
