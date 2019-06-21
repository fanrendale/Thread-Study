package com.book.ch7.knobble_2.mainGroup;

/**
 * 线程组里加线程组
 *
 * @Author: xjf
 * @Date: 2019/6/19 15:06
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("线程组名称：" + Thread.currentThread().getThreadGroup().getName());

        System.out.println("线程组中活动的线程数量：" +
                Thread.currentThread().getThreadGroup().activeCount());

        System.out.println("添加线程组前---活动的线程组数量：" +
                Thread.currentThread().getThreadGroup().activeGroupCount());

        //显示添加线程组到main线程组中
        ThreadGroup threadGroup = new ThreadGroup(Thread.currentThread().getThreadGroup(),"newGroup");

        System.out.println("添加线程组后---活动的线程组数量：" +
                Thread.currentThread().getThreadGroup().activeGroupCount());

        System.out.println("父线程组名称为：" +
                Thread.currentThread().getThreadGroup().getParent().getName());
    }
}
