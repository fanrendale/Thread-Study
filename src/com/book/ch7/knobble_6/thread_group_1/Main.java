package com.book.ch7.knobble_6.thread_group_1;

/**
 * 验证在一个线程组中有多个线程时，如果有一个线程出现异常，其他线程还是会继续运行
 *
 * @Author: xjf
 * @Date: 2019/6/21 9:19
 */
public class Main {

    public static void main(String[] args) {
        ThreadGroup threadGroup = new ThreadGroup("我的线程组");

        MyThread[] myThreads = new MyThread[10];
        for (int i = 0; i < myThreads.length; i++) {
            myThreads[i] = new MyThread(threadGroup,"线程" + (i+1),"1");
            myThreads[i].start();
        }

        MyThread newMyThread = new MyThread(threadGroup,"报错线程", "a");
        newMyThread.start();
    }
}
