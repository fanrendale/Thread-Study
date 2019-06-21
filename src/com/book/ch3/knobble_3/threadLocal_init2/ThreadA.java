package com.book.ch3.knobble_3.threadLocal_init2;

/**
 * 再次验证ThreadLocal变量有初始值后，变量的隔离性
 *
 * @Author: xjf
 * @Date: 2019/6/11 17:00
 */
public class ThreadA extends Thread{

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
