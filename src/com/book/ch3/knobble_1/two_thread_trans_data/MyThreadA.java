package com.book.ch3.knobble_1.two_thread_trans_data;

/**
 * @Author: xjf
 * @Date: 2019/6/7 8:51
 */
public class MyThreadA extends Thread {

     private MyList list;

    public MyThreadA(MyList list) {
        this.list = list;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                list.addElement();
                System.out.println("已经添加了" + (i+1) + "个元素了");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
