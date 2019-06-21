package com.book.ch2.knobble_2.sync_two_block;

import com.book.util.PrintUtil;

/**
 * @Author: xjf
 * @Date: 2019/6/4 9:19
 */
public class Service {

    synchronized public static void print1(){
        try {
            PrintUtil.enterPrint("print1");
            Thread.sleep(3000);
            PrintUtil.leavePrint("print1");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public static void print2(){
        PrintUtil.enterPrint("print2");
        PrintUtil.leavePrint("print2");
    }

    synchronized public void print3(){
        PrintUtil.enterPrint("print3");
        PrintUtil.leavePrint("print3");
    }
}
