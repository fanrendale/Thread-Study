package com.book.ch7.knobble_5.thread_create_exception;

/**
 * setUncaughtExceptionHandler方法给线程对象设置异常处理器
 *
 * @Author: xjf
 * @Date: 2019/6/20 11:40
 */
public class Main {

    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();

        myThread1.setName("myThread1");
        myThread1.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("ThreadName=" + t.getName() + " 出现了异常：" + e.getMessage());
                e.printStackTrace();
            }
        });

        myThread1.start();

        MyThread myThread2 = new MyThread();
        myThread2.setName("MyThread2");
        myThread2.start();
    }
}
