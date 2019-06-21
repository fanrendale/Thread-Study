package com.book.ch2.knobble_2.dirty_read;

/**
 * 同步块或同步方法的执行是同步的，但是多个线程调用时的顺序却是随机的，如果两个方法带有分支判断，
 * 则可能会出现逻辑上的错误，造成脏读。本例是复现该错误
 *
 * @Author: xjf
 * @Date: 2019/6/3 17:10
 */
public class Main {

    public static void main(String[] args) {
        try {
            MyOneList list = new MyOneList();

            MyThreadA threadA = new MyThreadA(list);
            threadA.start();

            MyThreadB threadB = new MyThreadB(list);
            threadB.start();

            Thread.sleep(5000);

            System.out.println("size=" + list.getSize());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
