package com.book.ch2.knobble_3.server_mode_test;

/**
 * 不加打印语句停止不了RunThread的原因：
 * （在JVM 64bit的server模式中执行）
 * 猜测，由于RunThread没有执行任何语句，可能所取的isRunning的值是线程私有堆栈中的值，而在main线程中修改的isRunning的值是公共堆栈的。
 * 而加了打印语句后，RunThread才会进行刷新去取公共堆栈的值，能实现停止
 *
 * 猜测依据：加了volatile修改的boolean的变量后，能够停止。
 *
 * 查看了博客：https://www.cnblogs.com/daxin/p/3364014.html
 * 猜测正确
 *
 * volatile:使线程的私有堆栈和公共堆栈的变量进行同步，而使用该修饰符后，线程将不是在私有堆栈中取值，而是从公共堆栈去取值。
 *
 * @Author: xjf
 * @Date: 2019/6/6 9:15
 */
public class Main {

    public static void main(String[] args) {
        RunThread runThread = new RunThread();
        runThread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        runThread.setRunning(false);

        System.out.println("子线程isRunning：" + runThread.isRunning());

        System.out.println("修改了isRunning的值   threadName=" + Thread.currentThread().getName());

    }
}
