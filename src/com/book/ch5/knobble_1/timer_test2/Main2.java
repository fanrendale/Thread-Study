package com.book.ch5.knobble_1.timer_test2;

import com.book.util.PrintUtil;
import com.book.util.TimeUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * TimerTask是以队列的方式一个一个被顺序执行的，所以执行的时间有可能和预期的时间不一致，因为前面的任务有可能消耗的时间较长，
 * 则后面的任务运行的时间也会被延迟。
 *
 * @Author: xjf
 * @Date: 2019/6/14 17:00
 */
public class Main2 {

    private static Timer timer = new Timer();

    public static class MyTask1 extends TimerTask{

        @Override
        public void run() {
            try {
                System.out.println("MyTask1开始执行的时间：" + TimeUtil.convertToString(System.currentTimeMillis()));
                Thread.sleep(20000);
                System.out.println("MyTask1结束执行的时间：" + TimeUtil.convertToString(System.currentTimeMillis()));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static class MyTask2 extends TimerTask{

        @Override
        public void run() {
            try {
                System.out.println("MyTask2 开始执行的时间：" + TimeUtil.convertToString(System.currentTimeMillis()));
                Thread.sleep(20000);
                System.out.println("MyTask2 结束执行的时间：" + TimeUtil.convertToString(System.currentTimeMillis()));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws ParseException {
        MyTask1 task1 = new MyTask1();
        MyTask2 task2 = new MyTask2();

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String specifiedTime1 = "2019-06-14 17:22:00";
        String specifiedTime2 = "2019-06-14 17:22:10";

        Date date1 = sdf1.parse(specifiedTime1);
        Date date2 = sdf2.parse(specifiedTime2);

        System.out.println("定时时间1：" + specifiedTime1 +". 现在的时间: " + TimeUtil.convertToString(System.currentTimeMillis()));
        System.out.println("定时时间2：" + specifiedTime2 +". 现在的时间: " + TimeUtil.convertToString(System.currentTimeMillis()));

        timer.schedule(task1,date1);
        timer.schedule(task2,date2);
    }
}
