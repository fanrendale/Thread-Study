package com.book.ch3.knobble_4.inheritabelThreadLocal_test2;

/**
 * InheritableThreadLocal类的childValue()方法可以对子线程继承的值进行修改
 *
 * 在子线程获取值的同时，如果主线程对值进行了修改，则子线程获取到的是旧值
 *
 * @Author: xjf
 * @Date: 2019/6/11 17:37
 */
public class Main {

    public static void main(String[] args) {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Main获取值：" + Tools.localValue.get());
                Thread.sleep(100);
            }


            Thread.sleep(5000);


            ThreadA a = new ThreadA();

            //主线程在这儿进行了值的修改，同时马上运行子线程，则子线程不会获取到修改后的值，而是取到旧值
            Tools.localValue.set("主线程修改了值");

            a.start();
            a.join();

            System.out.println("Main的值：" + Tools.localValue.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
