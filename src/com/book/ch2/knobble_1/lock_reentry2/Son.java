package com.book.ch2.knobble_1.lock_reentry2;

/**
 * @Author: xjf
 * @Date: 2019/5/30 11:45
 */
public class Son extends Parent {

    synchronized public void sonPrintMethod(){
        try {
            while (i > 0){
                System.out.println("son print i=" + i);
                i--;
                Thread.sleep(100);
                this.parentPrintMethod();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
