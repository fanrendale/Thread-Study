package com.book.ch1.suspend_resume_deal_lock;

/**
 * @Author: xjf
 * @Date: 2019/5/26 14:00
 */
public class SynchronizedObject {

    synchronized public void printString(){
        System.out.println("printString-------begin");
        if ("a".equals(Thread.currentThread().getName())){
            System.out.println("a线程永远suspend了！");
            Thread.currentThread().suspend();
        }
        System.out.println("printString-------end");

    }
}
