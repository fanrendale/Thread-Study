package com.book.ch7.knobble_2.group_add_thread;

/**
 * 线程对象关联线程组：1级关联
 *
 * @Author: xjf
 * @Date: 2019/6/19 10:05
 */
public class Main {

    public static void main(String[] args) {
        ThreadA aRunnable = new ThreadA();
        ThreadB bRunnable = new ThreadB();

        ThreadGroup group = new ThreadGroup("xjf的线程组");
        Thread threadA = new Thread(group,aRunnable);
        Thread threadB = new Thread(group,bRunnable);

        threadA.start();
        threadB.start();

        System.out.println("活动的线程数为：" + group.activeCount());
        System.out.println("线程组的名称为：" + group.getName());
    }
}
