package com.book.ch7.knobble_2.get_group_parent;

/**
 * 获取根线程组
 *
 * JVM的根线程组为system，如果再往上获取父线程组则会报NullPointerException
 *
 * @Author: xjf
 * @Date: 2019/6/19 14:59
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("线程：" + Thread.currentThread().getName() +
                " 所在的线程组为: " + Thread.currentThread().getThreadGroup().getName());

        System.out.println("main线程所在的线程组的父线程组为：" +
                Thread.currentThread().getThreadGroup().getParent().getName());

        System.out.println("main线程所在的线程组的父线程组的父线程组为：" +
                Thread.currentThread().getThreadGroup().getParent().getParent().getName());
    }
}
