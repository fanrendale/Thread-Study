package com.book.ch7.knobble_7.thead_exception_move;

/**
 * 测试线程和线程组对异常的处理
 *
 * @Author: xjf
 * @Date: 2019/6/21 9:59
 */
public class Main2 {

    public static void main(String[] args) {
        MyThreadGroup myThreadGroup = new MyThreadGroup("我的线程组");
        MyThread myThread = new MyThread(myThreadGroup,"我的线程");

        //对象
//        myThread.setUncaughtExceptionHandler(new ObjectUncaughtExceptionHandler());

        //类
        MyThread.setDefaultUncaughtExceptionHandler(new StateUncaughtExceptionHandler());

        myThread.start();
    }
}
