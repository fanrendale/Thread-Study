package com.book.ch3.knobble_1.wait_notify_insert_test;

/**
 * @Author: xjf
 * @Date: 2019/6/10 10:06
 */
public class DBTools {

    /**
     * 以此变量标记上一次是否为A备份
     */
    volatile private boolean prevIsA = false;

    synchronized public void backupA(){
        try {
            while (prevIsA == true){
                System.out.println("ThreadName=" +Thread.currentThread().getName() + ": wait-----A");
                wait();
            }

            System.out.println("ThreadName=" +Thread.currentThread().getName() + ":");
            for (int i = 0; i < 5; i++) {
                System.out.println("★★★★★★");
            }
            prevIsA = true;
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void backupB(){
        try {
            while (prevIsA == false){
                System.out.println("ThreadName=" +Thread.currentThread().getName() + ": wait-----B");
                wait();
            }

            System.out.println("ThreadName=" +Thread.currentThread().getName() + ":");
            for (int i = 0; i < 5; i++) {
                System.out.println("☆☆☆☆☆");
            }

            prevIsA = false;
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
