package com.book.ch7.knobble_7.thead_exception_move;

/**
 * @Author: xjf
 * @Date: 2019/6/21 9:58
 */
public class ObjectUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("对象的异常处理");
        e.printStackTrace();
    }
}
