package com.book.ch7.knobble_7.thead_exception_move;

/**
 * 测试线程和线程组对异常的处理
 *
 * @Author: xjf
 * @Date: 2019/6/21 9:59
 */
public class Main1 {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();

        //对象
//        myThread.setUncaughtExceptionHandler(new ObjectUncaughtExceptionHandler());

        //类
        MyThread.setDefaultUncaughtExceptionHandler(new StateUncaughtExceptionHandler());

        myThread.start();
    }
}
