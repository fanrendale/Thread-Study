package com.book.ch4.knobble_1.lock_interruptily_test;

import com.book.util.PrintUtil;

/**
 * 方法lockInterruptily：如果当前线程未被中断，则获取锁定，如果已经被中断，则报出异常
 *
 * @Author: xjf
 * @Date: 2019/6/13 14:04
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.testMethod();
            }
        };

        Thread threadA = new Thread(runnable);
        threadA.setName("threadA");
        threadA.start();

        Thread.sleep(1000);

        Thread threadB = new Thread(runnable);
        threadB.setName("threadB");
        threadB.start();
        //中断标记
        threadB.interrupt();

        PrintUtil.leavePrint("main");
    }
}
