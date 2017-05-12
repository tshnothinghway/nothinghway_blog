package com.noth.thread.common.base.sync;

import com.noth.thread.common.base.sync.Cinema;

/**
 * Created by thway on 2017/5/12.
 */
public class TicketsOffice2 implements Runnable {
    private Cinema cinema;

    public TicketsOffice2(Cinema cinema) {
        this.cinema = cinema;
    }

    @Override
    public void run() {
        cinema.sellTickets2(2);
        cinema.sellTickets2(4);
        cinema.sellTickets1(2);
        cinema.sellTickets1(1);
        cinema.reutrnTicktes2(2);
        cinema.sellTickets1(3);
        cinema.sellTickets2(2);
        cinema.sellTickets1(2);

    }
}
