package com.book.ch2.knobble_1.lock_reentry;

/**
 * @Author: xjf
 * @Date: 2019/5/30 11:26
 */
public class MyService {

    synchronized public void service1(){
        System.out.println("service1");
        service2();
    }

    synchronized public void service2(){
        System.out.println("service2");
        service3();
    }

    synchronized public void service3(){
        System.out.println("service3");
    }
}
