package com.book.ch3.knobble_3.threadLocal_test2;

import java.util.Date;

/**
 * @Author: xjf
 * @Date: 2019/6/11 15:40
 */
public class ThreadA extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
                if(Tools.localValue.get() == null){
                    Tools.localValue.set(new Date());
                }
                System.out.println("A: " + Tools.localValue.get().getTime());
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
