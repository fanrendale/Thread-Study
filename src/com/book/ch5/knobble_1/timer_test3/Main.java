package com.book.ch5.knobble_1.timer_test3;

import com.book.util.TimeUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * schedule(TimerTask task, Date firstTime, long period):该方法在执行的时间开始执行后，会在设定的间隔时间一直循环执行
 *  如果执行时间早于当前时间，则马上执行
 *  
 * @Author: xjf
 * @Date: 2019/6/14 17:29
 */
public class Main {

    private static Timer timer = new Timer();

    public static class MyTask extends TimerTask{
        @Override
        public void run() {
            System.out.println("MyTask执行了。时间：" + TimeUtil.convertToString(System.currentTimeMillis()));
        }
    }

    public static void main(String[] args) throws ParseException {
        MyTask task = new MyTask();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String specifiedTime = "2019-06-14 17:35:00";
        Date date = sdf.parse(specifiedTime);

        System.out.println("任务定时时间：" + specifiedTime + " . 现在的时间：" + TimeUtil.nowString());

        timer.schedule(task,date,3000);
    }
}
