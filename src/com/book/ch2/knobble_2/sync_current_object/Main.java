package com.book.ch2.knobble_2.sync_current_object;

/**
 * 验证synchronized(this)代码块是锁定当前对象的
 * @Author: xjf
 * @Date: 2019/5/31 14:11
 */
public class Main {

    public static void main(String[] args) {
        Task task = new Task();

        MyThreadA threadA = new MyThreadA(task);
        threadA.setName("threadA");
        threadA.start();

        MyThreadB threadB = new MyThreadB(task);
        threadB.setName("threadB");
        threadB.start();
    }
}
