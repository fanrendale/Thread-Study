package com.book.ch6.knobble_6.singleton_enum;

/**
 * 使用枚举类实现单例
 *
 * 枚举和静态代码块的特性相似，在使用枚举类时，构造方法会被自动调用。
 *
 * @Author: xjf
 * @Date: 2019/6/18 11:16
 */
public class Main {

    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        MyThread thread3 = new MyThread();

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
