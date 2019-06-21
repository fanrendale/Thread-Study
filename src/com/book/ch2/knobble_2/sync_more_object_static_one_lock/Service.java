package com.book.ch2.knobble_2.sync_more_object_static_one_lock;

import com.book.util.PrintUtil;

/**
 * @Author: xjf
 * @Date: 2019/6/4 10:42
 */
public class Service {

    /*synchronized*/ public /*static*/ void printA(){
        synchronized (Service.class){
            try {
                PrintUtil.enterPrint("printA");
                Thread.sleep(3000);
                PrintUtil.leavePrint("printA");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    /*synchronized*/ public /*static*/ void printB(){
        synchronized (Service.class){
            PrintUtil.enterPrint("printB");
            PrintUtil.leavePrint("printB");
        }

    }
}
