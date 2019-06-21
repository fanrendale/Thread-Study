package com.book.ch1.current_thread;

/**
 * @author xjf
 * @date 2019/5/24 16:50
 */
public class Main {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
//        thread.start();
        thread.run();
    }
}
