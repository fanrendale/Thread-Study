package com.book.ch3.knobble_1.two_thread_trans_data;

/**
 * 使用sleep和while来实现线程间的通信
 *
 * @Author: xjf
 * @Date: 2019/6/7 8:57
 */
public class Main {

    public static void main(String[] args) {
        MyList list = new MyList();

        MyThreadA threadA = new MyThreadA(list);
        threadA.setName("A");
        threadA.start();

        MyThreadB threadB = new MyThreadB(list);
        threadB.setName("B");
        threadB.start();
    }
}
