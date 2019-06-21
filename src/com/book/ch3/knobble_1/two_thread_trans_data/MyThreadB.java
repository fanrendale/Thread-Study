package com.book.ch3.knobble_1.two_thread_trans_data;

/**
 * @Author: xjf
 * @Date: 2019/6/7 8:54
 */
public class MyThreadB extends Thread {

     private MyList list;

    public MyThreadB(MyList list) {
        this.list = list;
    }

    @Override
    public void run() {
        try {
            //此处采用一直使用while循环来轮询list的size值，这样会很浪费CPU资源
            while (true){
                if (list.getSize() == 5){
                    System.out.println("list的元素个为5个，threadName=" + Thread.currentThread().getName() + "退出了");
                    throw new InterruptedException("退出");
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
