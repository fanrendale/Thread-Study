package com.book.ch2.knobble_2.dead_lock_test;

/**
 * @Author: xjf
 * @Date: 2019/6/4 14:20
 */
public class DeadThread implements Runnable {

    private String username;
    private Object lock1 = new Object();
    private Object lock2 = new Object();

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public void run() {
        if ("a".equals(username)){
            synchronized (lock1){
                try {
                    System.out.println("username=" + username);
                    Thread.sleep(3000);

                    synchronized (lock2){
                        System.out.println("lock1-->lock2的执行顺序执行成功了！");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }else {
            synchronized (lock2){
                System.out.println("username=" + username);

                synchronized (lock1){
                    System.out.println("lock2-->lock1的执行顺序执行成功了！");
                }
            }
        }
    }
}
