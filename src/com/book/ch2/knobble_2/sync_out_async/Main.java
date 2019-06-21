package com.book.ch2.knobble_2.sync_out_async;

/**
 * @Author: xjf
 * @Date: 2019/6/3 10:41
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
