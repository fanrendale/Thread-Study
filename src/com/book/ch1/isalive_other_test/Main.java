package com.book.ch1.isalive_other_test;

/**
 * @Author: xjf
 * @Date: 2019/5/25 9:40
 */
public class Main {
    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);
        System.out.println("main----start---------thread.isAlive() : " + thread.isAlive());
        thread.setName("A");
        thread.start();
        System.out.println("main----end---------thread.isAlive() : " + thread.isAlive());
    }
}
