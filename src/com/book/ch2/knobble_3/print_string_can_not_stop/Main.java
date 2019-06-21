package com.book.ch2.knobble_3.print_string_can_not_stop;

/**
 * 当用main线程执行while循环时，再在主方法中改变isContinue的值进行停止打印时，发现停止不了
 * 原因是因为main线程一直在处理while循环，不能继续执行main方法后面的方法。
 *
 *
 * @Author: xjf
 * @Date: 2019/6/5 15:51
 */
public class Main {

    public static void main(String[] args) {
        PrintString printString = new PrintString();

        //如果执行循环的是另一个线程，则可以使用main线程改变状态达到停止
        /*Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                printString.printMethod();
            }
        },"A");
        thread.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        printString.printMethod();
        System.out.println("我要让printMethod方法停止！  threadName=" + Thread.currentThread().getName());
        printString.setContinueRun(false);
    }
}
