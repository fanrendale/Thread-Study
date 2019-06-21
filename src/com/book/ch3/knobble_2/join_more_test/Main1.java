package com.book.ch3.knobble_2.join_more_test;

import com.book.util.PrintUtil;

/**
 * @Author: xjf
 * @Date: 2019/6/11 11:28
 */
public class Main1 {

    public static void main(String[] args) {
        ThreadB threadB = new ThreadB();
        ThreadA threadA = new ThreadA(threadB);

        threadA.setName("A");
        threadB.setName("B");

        threadA.start();
        threadB.start();

        PrintUtil.leavePrint("main");
    }
}
