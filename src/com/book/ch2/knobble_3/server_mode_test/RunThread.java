package com.book.ch2.knobble_3.server_mode_test;

/**
 * @Author: xjf
 * @Date: 2019/6/6 9:14
 */
public class RunThread extends Thread {
    private boolean isRunning = true;
    //加了volatile后能实现正常停止
//    private volatile boolean isRunning = true;

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    @Override
    public void run() {
        System.out.println("进入run了  threadName=" + Thread.currentThread().getName());
        while(isRunning){

            //在这儿加了一个打印语句后，在主线程中修改了isRunning的值后能正常停止，
            //如果不加该语句，则无法停止，不知道原因？
//            System.out.println(isRunning);
        }
        System.out.println("离开run了");
    }
}
