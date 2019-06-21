package com.book.ch1.stop_thread;

/**
 * @Author: xjf
 * @Date: 2019/5/25 14:12
 */
public class MyThread extends Thread {
    private int i = 0;

    @Override
    public void run() {
       /* try {
            while (true){
                i++;
                System.out.println("i = " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        try {
            //使用stop方法停止线程，会抛出ThreadDeath异常，并且会对锁定的对象“解锁”
            this.stop();
        } catch (ThreadDeath e) {
            System.out.println("进入了catch方法");
            e.printStackTrace();
        }
    }
}
