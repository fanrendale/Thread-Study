package com.book.ch3.knobble_1.wait_notify_test;

/**
 * 测试wait方法
 * @Author: xjf
 * @Date: 2019/6/7 11:06
 */
public class TestMain2 {

    public static void main(String[] args) {
        try {
            String lock = new String();

            System.out.println("同步块前面的语句");
            synchronized (lock){
                System.out.println("进入同步块了");

                lock.wait();

                System.out.println("离开同步块了");
            }

            System.out.println("同步块后面的语句");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
