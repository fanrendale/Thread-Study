package com.book.ch2.knobble_2.sync_static_method;

import com.book.util.PrintUtil;

/**
 * @Author: xjf
 * @Date: 2019/6/4 8:43
 */
public class Service {

    /**
     * 静态同步方法1
     */
    synchronized public static void method1(){
        try {
            PrintUtil.enterPrint("method1");

            Thread.sleep(3000);

            PrintUtil.leavePrint("method1");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 静态同步方法2
     */
    synchronized public static void method2(){
        PrintUtil.enterPrint("method2");
        PrintUtil.leavePrint("method2");
    }
}
