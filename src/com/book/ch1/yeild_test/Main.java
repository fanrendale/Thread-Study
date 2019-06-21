package com.book.ch1.yeild_test;

/**
 * 线程调用yield()会放弃当前CPU资源，将它让给其他的任务去占用CPU执行时间。
 * 但放弃的时间不确定，有可能刚刚放弃，马上又获得CPU时间片
 * @Author: xjf
 * @Date: 2019/5/27 22:38
 */
public class Main {

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
