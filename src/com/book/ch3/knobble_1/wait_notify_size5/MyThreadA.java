package com.book.ch3.knobble_1.wait_notify_size5;

/**
 * @Author: xjf
 * @Date: 2019/6/7 8:51
 */
public class MyThreadA extends Thread {

     private MyList list;

     private Object lock;

    public MyThreadA(MyList list, Object lock) {
        this.list = list;
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            try {
                for (int i = 0; i < 10; i++) {
                    list.addElement();
                    System.out.println("已经添加了" + (i + 1) + "个元素了");
                    Thread.sleep(1000);
                    if (list.getSize() == 5){
                        //通知
                        lock.notify();
                        System.out.println("已发出通知了");
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
