package com.book.ch2.knobble_1.dirty_read;

/**
 * @Author: xjf
 * @Date: 2019/5/30 10:04
 */
public class MyThread extends Thread {

    private PublicVar publicVarRef;

    public MyThread(PublicVar publicVarRef) {
        this.publicVarRef = publicVarRef;
    }

    @Override
    public void run() {
        publicVarRef.setValue("B","BB");
    }
}
