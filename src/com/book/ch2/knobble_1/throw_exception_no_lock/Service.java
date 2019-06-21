package com.book.ch2.knobble_1.throw_exception_no_lock;

import com.book.util.TimeUtil;

/**
 * @Author: xjf
 * @Date: 2019/5/30 15:29
 */
public class Service {

    synchronized public void testMethod(){
        if ("a".equals(Thread.currentThread().getName())){
            System.out.println("ThreadName=" + Thread.currentThread().getName() +
                    " run begin. time: " + TimeUtil.convertToString(System.currentTimeMillis()));
            while (true){
                if ("0.1234567".equals(("" + Math.random()).substring(0,9))){
                    System.out.println("ThreadName=" + Thread.currentThread().getName() +
                            " run. exception time=" + TimeUtil.convertToString(System.currentTimeMillis()));
                    Integer.parseInt("a");
                }
            }
        }else {
            System.out.println("ThreadName=" + Thread.currentThread().getName() +
                    " run. time: " + TimeUtil.convertToString(System.currentTimeMillis()));
        }
    }
}
