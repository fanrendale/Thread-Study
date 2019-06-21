package com.book.ch2.knobble_2.inner_test2;

/**
 * 测试内部类和synchronized的使用
 *
 * 该例的InnerClass1的method1的同步块和InnerClass2的method1都使用了InnerClass2的类作为“对象监视器”，
 * 而InnerClass1的method2使用的是对象锁，因此前两个方法时同步执行的，后一个方法是异步的。
 * @Author: xjf
 * @Date: 2019/6/4 16:35
 */
public class Main {

    public static void main(String[] args) {
        OutClass.InnerClass1 innerClass1 = new OutClass.InnerClass1();
        OutClass.InnerClass2 innerClass2 = new OutClass.InnerClass2();

        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                innerClass1.method1(innerClass2);
            }
        }, "A");

        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                innerClass1.method2();
            }
        }, "B");

        Thread threadC = new Thread(new Runnable() {
            @Override
            public void run() {
                innerClass2.method1();
            }
        },"C");

        threadA.start();
        threadB.start();
        threadC.start();
    }
}
