package com.book.ch2.knobble_1.lock_reentry2;

/**
 * 在父子类继承关系中，也可以进行锁重入
 * @Author: xjf
 * @Date: 2019/5/30 11:53
 */
public class Main {

    public static void main(String[] args) {
        Son son = new Son();

        MyThread thread = new MyThread(son);
        thread.run();
    }
}
