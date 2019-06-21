package com.book.ch5.knobble_1.timer_test3;

import com.book.util.TimeUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Timer中的cancel()是将任务队列中的所有任务都清空
 *
 * @Author: xjf
 * @Date: 2019/6/15 9:28
 */
public class Main4 {

    private static Timer timer = new Timer();

    public static class MyTaskA extends TimerTask{
        @Override
        public void run() {
            System.out.println("MyTaskA运行了，时间：" + TimeUtil.nowString());

            //Timer中的cancel是将任务队列中的所有任务都清空
            timer.cancel();
        }
    }

    public static class MyTaskB extends  TimerTask{
        @Override
        public void run() {
            System.out.println("MyTaskB运行了，时间：" + TimeUtil.nowString());
        }
    }

    public static void main(String[] args) throws ParseException {
        MyTaskA taskA = new MyTaskA();
        MyTaskB taskB = new MyTaskB();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String specifiedTime = "2019-06-15 09:36:00";
        Date date = sdf.parse(specifiedTime);

        System.out.println("指定的任务时间：" + specifiedTime + ". 现在的时间：" + TimeUtil.nowString());

        //开始任务
        timer.schedule(taskB, date, 3000);
        timer.schedule(taskA, date, 3000);

    }
}
