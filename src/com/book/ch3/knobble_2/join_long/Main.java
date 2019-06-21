package com.book.ch3.knobble_2.join_long;

import com.book.util.PrintUtil;

/**
 * 测试线程join带时间的方法，线程会等待规定的时间，如果在传入的时间内子线程还没有执行完，则当前线程不再等待会继续执行
 *
 * 使用join和sleep的区别：join运行后会释放锁，而sleep运行不会释放锁
 *
 * @Author: xjf
 * @Date: 2019/6/10 13:48
 */
public class Main {

    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();

            myThread.start();
            //只等2秒
            //在这儿使用join和sleep方法达到的效果是相同的，但是他们对同步处理不一样
            myThread.join(2000);
//            Thread.sleep(2000);

            PrintUtil.leavePrint("main");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
