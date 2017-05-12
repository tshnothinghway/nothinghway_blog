package com.noth.thread.common.base.sync;

/**
 * Created by thway on 2017/5/12.
 * cinema  电影院
 * 提供购票退票和余票查询功能
 */
public class Cinema {
    private long vacanciesCinemas1;
    private long vacanciesCinemas2;
    private final Object controlCinema1;
    private final Object controlCinema2;
    public Cinema() {
        this.vacanciesCinemas1 = 20;
        this.vacanciesCinemas2 = 20;
        this.controlCinema1 = new Object();
        this.controlCinema2 = new Object();
    }

    //售票
    public  boolean sellTickets1(int number) {
        synchronized (controlCinema1){
            if(number < vacanciesCinemas1) {
                vacanciesCinemas1 -= number;
                return true;
            }
            else {
                return false;
            }

        }
    }

    //售票
    public  boolean sellTickets2(int number) {
        synchronized (controlCinema2){
            if(number < vacanciesCinemas2) {
                vacanciesCinemas2 -= number;
                return true;
            }
            else {
                return false;
            }

        }
    }

    //退票
    public  boolean returnTickets1(int number) {
        synchronized (controlCinema1) {
            vacanciesCinemas1 += number;
            return  true;
        }
    }

    //退票
    public  boolean reutrnTicktes2(int number) {
        synchronized (controlCinema2){
            vacanciesCinemas2 += number;
            return  true;
        }
    }

    //查看余票
    public  long getVacanciesCinemas1() {
        return vacanciesCinemas1;
    }
    public  long getVacanciesCinemas2() {
        return vacanciesCinemas2;
    }




}
