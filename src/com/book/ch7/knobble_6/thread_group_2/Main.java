package com.book.ch7.knobble_6.thread_group_2;

/**
 * 使用线程组，在有一个线程出现异常时，所有线程都终止
 *
 * 重写线程组的uncaughtException方法，并打上中断标记，线程运行时如果标记是中断则结束线程运行。
 *
 * @Author: xjf
 * @Date: 2019/6/21 9:19
 */
public class Main {

    public static void main(String[] args) {
        MyThreadGroup threadGroup = new MyThreadGroup("我的线程组");

        MyThread[] myThreads = new MyThread[10];
        for (int i = 0; i < myThreads.length; i++) {
            myThreads[i] = new MyThread(threadGroup,"线程" + (i+1),"1");
            myThreads[i].start();
        }

        MyThread newMyThread = new MyThread(threadGroup,"报错线程", "a");
        newMyThread.start();
    }
}
