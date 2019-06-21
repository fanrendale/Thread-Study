package com.book.ch3.knobble_2.join_execption;

/**
 * @Author: xjf
 * @Date: 2019/6/10 11:27
 */
public class ThreadB extends Thread {

    @Override
    public void run() {
        try {
            ThreadA threadA = new ThreadA();
            threadA.start();
            threadA.join();

            System.out.println("本句话是在B线程执行完成后打印的");
        } catch (InterruptedException e) {
            System.out.println("本句话是在B线程的异常块打印的");
            e.printStackTrace();
        }
    }
}
