package com.book.ch5.knobble_1.timer_test4;

import com.book.util.TimeUtil;

import java.util.Timer;
import java.util.TimerTask;

/**
 * schedule(TimerTask task, long delay):该方法的作用是以执行schedule方法当前的时间为参考时间，在此时间基础上延迟指定
 * 的毫秒数后执行一次TimerTask任务。
 *
 * @Author: xjf
 * @Date: 2019/6/16 13:46
 */
public class Main {

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

        timer.schedule(myTask,7000);
    }
}
