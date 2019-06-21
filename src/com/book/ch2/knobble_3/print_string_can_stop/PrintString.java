package com.book.ch2.knobble_3.print_string_can_stop;

import com.book.util.PrintUtil;

/**
 * @Author: xjf
 * @Date: 2019/6/5 15:47
 */
public class PrintString implements Runnable{

    private boolean isContinueRun = true;

    public boolean isContinueRun() {
        return isContinueRun;
    }

    public void setContinueRun(boolean continueRun) {
        isContinueRun = continueRun;
    }

    public void printMethod(){
        try {
            while (isContinueRun){
                PrintUtil.enterPrint("printMethod");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        printMethod();
    }
}
