package com.book.ch4.knobble_1.lock_method_test1.test1;

/**
 * getHoldCount():获取当前线程保持此锁定的个数，也就是调用lock()方法的次数
 *
 * @Author: xjf
 * @Date: 2019/6/13 9:40
 */
public class Main {

    public static void main(String[] args) {
        Service service = new Service();

        service.testMethod1();


    }
}
