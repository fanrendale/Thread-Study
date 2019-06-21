package com.book.ch7.knobble_6.thread_group_2;

/**
 * @Author: xjf
 * @Date: 2019/6/21 9:12
 */
public class MyThread extends Thread {

    private String num;

    public MyThread(ThreadGroup threadGroup, String name, String num) {
        super(threadGroup,name);
        this.num = num;
    }

    /**
     * 每个线程的run方法中不能有异常catch语句，如果有catch语句，
     * 则public void uncaughtException(Thread t,Throwable e)不执行
     */
    @Override
    public void run() {
//        try {
            int numInt = Integer.parseInt(num);
            while (!this.isInterrupted()) {
                System.out.println("死循环中：" + Thread.currentThread().getName());
            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}
