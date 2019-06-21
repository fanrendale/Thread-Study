package com.book.ch2.knobble_2.string_and_sync2;

import com.book.util.PrintUtil;

/**
 * @Author: xjf
 * @Date: 2019/6/4 11:16
 */
public class Service {

    public static void print(Object object){
        try {
            synchronized (object){
                while (true){
                    PrintUtil.enterPrint("print");
                    Thread.sleep(1000);
                }
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
