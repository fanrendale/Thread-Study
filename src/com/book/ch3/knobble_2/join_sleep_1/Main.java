package com.book.ch3.knobble_2.join_sleep_1;

/**
 * 验证使用sleep时，不是释放对象锁
 *
 * @Author: xjf
 * @Date: 2019/6/10 14:28
 */
public class Main {

    public static void main(String[] args) {
        try {
            ThreadB threadB = new ThreadB();

            ThreadA threadA = new ThreadA(threadB);
            threadA.start();

            Thread.sleep(1000);

            ThreadC threadC = new ThreadC(threadB);
            threadC.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
