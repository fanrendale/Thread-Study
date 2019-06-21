package com.book.ch2.knobble_2.two_stop;

import com.book.util.PrintUtil;

/**
 * @Author: xjf
 * @Date: 2019/6/4 13:41
 */
public class Service {
    private Object object1 = new Object();
    private Object object2 = new Object();

    /*synchronized*/ public  void methodA(){
        synchronized (object1){
            PrintUtil.enterPrint("methodA");

            boolean isContinue = true;

            while (isContinue){
            }

            PrintUtil.leavePrint("methodA");
        }

    }

    /*synchronized*/ public void methodB(){
        synchronized (object2){
            PrintUtil.enterPrint("methodB");
            PrintUtil.leavePrint("methodB");
        }
    }
}
