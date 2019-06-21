package com.book.ch7.knobble_2.group_inner_stop;

/**
 * 使用线程组批量停止线程
 *
 * @Author: xjf
 * @Date: 2019/6/19 17:19
 */
public class Main {
    public static void main(String[] args) {
        MyThread[] myThreads = new MyThread[5];
        ThreadGroup threadGroup = new ThreadGroup("我的线程组");


        for (int i = 0; i < myThreads.length; i++) {
            myThreads[i] = new MyThread(threadGroup,"线程" + (i+1));
            myThreads[i].start();
        }

        try {
            Thread.sleep(5000);
            threadGroup.interrupt();
            System.out.println("线程组调用了interrupt方法！");
        } catch (InterruptedException e) {
            System.out.println("停止了");
            e.printStackTrace();
        }
    }
}
