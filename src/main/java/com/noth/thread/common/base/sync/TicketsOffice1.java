package com.noth.thread.common.base.sync;

import com.noth.thread.common.base.sync.Cinema;

/**
 * Created by thway on 2017/5/12.
 * 售票机
 */
public class TicketsOffice1 implements Runnable{

    private Cinema cinema;

    public TicketsOffice1(Cinema cinema) {
        this.cinema = cinema;
    }

    @Override
    public void run() {
        cinema.sellTickets1(3);
        cinema.sellTickets1(2);
        cinema.sellTickets1(2);
        cinema.returnTickets1(3);
        cinema.sellTickets1(5);
        cinema.sellTickets2(2);
        cinema.sellTickets2(2);
        cinema.sellTickets2(2);
    }
}
