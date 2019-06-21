package com.book.ch5.knobble_1.timer_test4;

import com.book.util.TimeUtil;

import java.util.Timer;
import java.util.TimerTask;

/**
 * schedule(TimerTask task, long delay, long period):该方法以当前时间开始，延迟指定的时间后开始执行任务，并且按指定的循环时间一直循环执行
 *
 * @Author: xjf
 * @Date: 2019/6/16 13:50
 */
public class Main2 {

    private static Timer timer = new Timer();

    public static class MyTask extends TimerTask{
        @Override
        public void run() {
            System.out.println("MyTask执行了，时间：" + TimeUtil.nowString());
        }
    }

    public static void main(String[] args) {
        MyTask myTask = new MyTask();

        System.out.println("当前时间：" + TimeUtil.nowString());

        timer.schedule(myTask,5000,1000);
    }
}
