package com.book.ch7.knobble_7.thead_exception_move;

/**
 * @Author: xjf
 * @Date: 2019/6/21 9:56
 */
public class MyThreadGroup extends ThreadGroup {
    public MyThreadGroup(String name) {
        super(name);
    }

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        super.uncaughtException(t, e);
        System.out.println("线程组的异常处理");
        e.printStackTrace();
    }
}
