package com.book.ch5.knobble_1.timer_test1;

import com.book.util.PrintUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 实现一个定时任务
 *
 * 1.Timer类的主要作用是设置计划任务，但封装任务的却是TimerTask类。
 * 执行计划任务的代码要放入TimerTask的子类中，因为TimerTask是个抽象类。
 *
 * 2.schedule方法：在指定的日期执行一次某一任务
 *
 * 3.如果设置的执行时间早于当前时间，则定时马上执行
 *
 * @Author: xjf
 * @Date: 2019/6/14 11:39
 */
public class Main {

    /**
     * 添加true参数为守护线程
     */
    private static Timer timer = new Timer(true);

    public static class MyTask extends TimerTask{
        @Override
        public void run() {
            PrintUtil.enterPrint("MyTask==>run");
        }
    }

    public static void main(String[] args) throws ParseException, InterruptedException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse("2019-06-14 12:28:00");

        MyTask myTask = new MyTask();

        timer.schedule(myTask,date);
        System.out.println("main begin");
        Thread.sleep(15000);
    }
}
