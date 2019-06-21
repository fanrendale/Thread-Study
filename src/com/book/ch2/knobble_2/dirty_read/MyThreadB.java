package com.book.ch2.knobble_2.dirty_read;

/**
 * @Author: xjf
 * @Date: 2019/6/3 17:09
 */
public class MyThreadB extends Thread {

    private MyOneList list;

    public MyThreadB(MyOneList list) {
        this.list = list;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.addServiceMethod(list,"b");
    }
}
