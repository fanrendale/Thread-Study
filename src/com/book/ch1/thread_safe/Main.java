package com.book.ch1.thread_safe;

/**
 * @author xjf
 * @date 2019/5/24 15:10
 */
public class Main {
    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        threadA.start();
        ThreadB threadB = new ThreadB();
        threadB.start();
    }
}
