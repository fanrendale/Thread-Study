package com.book.ch3.knobble_1.wait_notify_size5;

import com.book.util.PrintUtil;

/**
 * @Author: xjf
 * @Date: 2019/6/7 8:54
 */
public class MyThreadB extends Thread {

     private MyList list;
     private Object lock;

    public MyThreadB(MyList list, Object lock) {
        this.list = list;
        this.lock = lock;
    }

    @Override
    public void run() {

        synchronized (lock){
            try {
                PrintUtil.enterPrint("wait");
                lock.wait();
                PrintUtil.leavePrint("wait");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
