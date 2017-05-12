package com.noth.thread.test.sync;

import com.noth.thread.common.sync.Cinema;
import com.noth.thread.common.sync.TicketsOffice1;
import com.noth.thread.common.sync.TicketsOffice2;

/**
 * Created by thway on 2017/5/12.
 */
public class SyncMain {


    public static void main(String[] args) {
        Cinema cinema  = new Cinema();
        TicketsOffice1 office1 = new TicketsOffice1(cinema);
        Thread thread1 = new Thread(office1,"TicketsOffice1");

        TicketsOffice2 office2 = new TicketsOffice2(cinema);
        Thread thread2 = new Thread(office2,"TicketsOffice2");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("Room 1 Vacancies :%d\n",cinema.getVacanciesCinemas1());
        System.out.printf("Room 2 Vacancies :%d\n",cinema.getVacanciesCinemas2());
    }
}
