package com.book.ch2.knobble_3.print_string_can_stop;

/**
 * 让PrintString类实现Runnable方法，在run方法中执行打印的方法，在main方法中新建一个线程来执行打印。
 * 这样就可以在主线程中停止打印
 *
 * 注意：该示例代码的格式运行在 -server服务器模式中64bit的JVM上时，会出现死循环。解决的办法是使用volatile关键字。
 * （书上说的，没机器试验）
 *
 * 关键字volatile的所用是强制从堆栈中取得变量的值，而不是从线程私有数据栈中取得变量的值。
 *
 * @Author: xjf
 * @Date: 2019/6/5 16:02
 */
public class Main {

    public static void main(String[] args) {
        PrintString printString = new PrintString();
        new Thread(printString).start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("我要让printMethod方法停止！  threadName=" + Thread.currentThread().getName());
        printString.setContinueRun(false);
    }
}
