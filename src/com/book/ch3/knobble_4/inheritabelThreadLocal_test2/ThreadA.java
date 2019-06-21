package com.book.ch3.knobble_4.inheritabelThreadLocal_test2;

/**
 * @Author: xjf
 * @Date: 2019/6/11 17:36
 */
public class ThreadA extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("A线程获取值：" + Tools.localValue.get());
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
