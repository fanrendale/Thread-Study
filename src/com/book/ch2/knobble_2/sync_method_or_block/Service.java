package com.book.ch2.knobble_2.sync_method_or_block;

import com.book.util.TimeUtil;

/**
 * @Author: xjf
 * @Date: 2019/6/3 22:59
 */
public class Service {

    public void testMethod1(MyObject object){
        synchronized (object){
            try {
                System.out.println("testMethod1 ----getLock time=" + TimeUtil.convertToString(System.currentTimeMillis()) +
                        ". ThreadName=" + Thread.currentThread().getName());

                Thread.sleep(2000);

                System.out.println("testMethod1 ----releaseLock time=" + TimeUtil.convertToString(System.currentTimeMillis()) +
                        ". ThreadName=" + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
