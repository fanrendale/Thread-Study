package com.book.ch4.knobble_1.one_producer_one_customer;

/**
 * @author xjf
 * @date 2019/6/12 17:17
 */
public class PThread extends Thread {

    private MyService service;

    public PThread(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        while (true){
            service.product();
        }
    }
}
