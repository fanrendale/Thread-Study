package com.book.ch1.run_random;

/**
 * 测试线程的调用时机是随机的
 *
 * @Author: xjf
 * @Date: 2019/5/23 9:43
 */
public class Test {

    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.setName("MyThread");
            myThread.start();

            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("current threadName: " + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
