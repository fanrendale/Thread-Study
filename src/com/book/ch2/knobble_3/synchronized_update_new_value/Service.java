package com.book.ch2.knobble_3.synchronized_update_new_value;

import com.book.util.PrintUtil;
import com.sun.org.apache.xpath.internal.operations.String;

/**
 * @Author: xjf
 * @Date: 2019/6/7 8:22
 */
public class Service {

    private boolean isRunning = true;

    public void runMethod(){
        PrintUtil.enterPrint("runMethod");

        String anyString = new String();

        while (isRunning){
            //添加该同步块能使该循环正常停止
            synchronized (anyString){

            }
        }

        System.out.println("离开runMethod方法了");
    }

    public void stopMethod(){
        PrintUtil.enterPrint("stopMethod");
        isRunning = false;
    }
}
