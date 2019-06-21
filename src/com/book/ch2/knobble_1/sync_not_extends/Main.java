package com.book.ch2.knobble_1.sync_not_extends;

/**
 * 同步不能继承，只能在子类方法中另外写上synchronized.
 * @Author: xjf
 * @Date: 2019/5/30 17:11
 */
public class Main {

    public static void main(String[] args) {
        Son son = new Son();

        MyThreadA threadA = new MyThreadA(son);
        threadA.setName("A");
        threadA.start();

        MyThreadB threadB = new MyThreadB(son);
        threadB.setName("B");
        threadB.start();
    }
}
