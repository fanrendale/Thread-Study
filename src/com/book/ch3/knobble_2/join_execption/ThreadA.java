package com.book.ch3.knobble_2.join_execption;

/**
 * @Author: xjf
 * @Date: 2019/6/10 11:25
 */
public class ThreadA extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            String newString = new String();
            Math.random();

            //此处睡眠一会儿执行可以正常执行C线程，并中断B线程
//            try {
//                Thread.sleep(300);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}
