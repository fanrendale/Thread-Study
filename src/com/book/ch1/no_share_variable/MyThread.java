package com.book.ch1.no_share_variable;

/**
 * @Author: xjf
 * @Date: 2019/5/23 10:23
 */
public class MyThread extends Thread {

    private int count = 5;

    public MyThread(String name) {
        this.setName(name);
    }

    @Override
    public void run() {
        while (count > 0){
            count--;
            System.out.println("由线程：" + Thread.currentThread().getName() + "计算, count = " +
                    count);
        }
    }
}
