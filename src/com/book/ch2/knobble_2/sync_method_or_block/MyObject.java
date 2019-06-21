package com.book.ch2.knobble_2.sync_method_or_block;

import com.book.util.TimeUtil;

/**
 * @Author: xjf
 * @Date: 2019/6/3 22:57
 */
public class MyObject {

    /**
     * 为同步方法或同步块的执行效果是一样的，多个线程来调用时呈现同步效果
     */
    synchronized public void speedPrintString(){
//        synchronized (this){
            System.out.println("speedPrintString ----getLock time=" + TimeUtil.convertToString(System.currentTimeMillis()) +
                    ". ThreadName=" + Thread.currentThread().getName());

            System.out.println("---------------------------");

            System.out.println("speedPrintString ----releaseLock time=" + TimeUtil.convertToString(System.currentTimeMillis()) +
                    ". ThreadName=" + Thread.currentThread().getName());
//        }

    }
}
