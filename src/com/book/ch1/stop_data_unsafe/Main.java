package com.book.ch1.stop_data_unsafe;

/**
 * 使用stop停止线程时，会释放synchronized锁，导致数据不一致
 *
 * @Author: xjf
 * @Date: 2019/5/25 14:26
 */
public class Main {

    public static void main(String[] args) {

        try {
            SynchronizedObject object = new SynchronizedObject();
            MyThread myThread = new MyThread(object);
            myThread.start();
            Thread.sleep(500);
            myThread.stop();
            System.out.println("username: " + object.getUsername() + "    password: " + object.getPassword());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
