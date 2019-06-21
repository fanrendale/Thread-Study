package com.book.ch5.knobble_1.timer_test3;

import com.book.util.TimeUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 任务被延时了，还是会一个一个的顺序执行。
 *
 * 本来设置循环时间为4s，但是任务的执行时间为5s，则是按5s进行一次循环
 *
 * @Author: xjf
 * @Date: 2019/6/15 9:21
 */
public class Main2 {

    private static Timer timer = new Timer();

    public static class MyTask extends TimerTask{

        @Override
        public void run() {
            try {
                System.out.println("开始任务的时间：" + TimeUtil.nowString());

                Thread.sleep(5000);

                System.out.println("结束任务的时间：" + TimeUtil.nowString());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws ParseException {
        MyTask myTask = new MyTask();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String specifiedTime = "2019-06-15 09:26:00";
        Date date = sdf.parse(specifiedTime);

        System.out.println("指定的任务时间：" + specifiedTime + ". 现在的时间：" + TimeUtil.nowString());

        timer.schedule(myTask,date,4000);
    }
}
