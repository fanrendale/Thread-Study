package com.book.ch3.knobble_2.join_test;

import java.util.Random;

/**
 * @Author: xjf
 * @Date: 2019/6/10 10:44
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        //随机生成需要睡眠的时间
        try {
            int secondValue = (int) (Math.random() * 10000);
            System.out.println(secondValue);
            Thread.sleep(secondValue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
