package com.book.ch7.knobble_5.thread_create_exception;

/**
 * setDefaultUncaughtExceptionHandler方法设置类的全局异常处理器
 *
 * @Author: xjf
 * @Date: 2019/6/20 11:46
 */
public class Main1 {

    public static void main(String[] args) {
        //设置类的全局异常处理器
        MyThread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("ThreadName=" + t.getName() + " 出现了异常：" + e.getMessage());
                e.printStackTrace();
            }
        });

        MyThread thread1 = new MyThread();
        thread1.setName("thread1");
        thread1.start();

        MyThread thread2 = new MyThread();
        thread2.setName("thread2");
        thread2.start();
    }
}
