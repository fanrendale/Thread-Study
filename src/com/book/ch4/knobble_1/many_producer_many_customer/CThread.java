package com.book.ch4.knobble_1.many_producer_many_customer;


/**
 * @author xjf
 * @date 2019/6/12 17:17
 */
public class CThread extends Thread {

    private MyService service;

    public CThread(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        while (true){
            service.consume();
        }
    }
}
