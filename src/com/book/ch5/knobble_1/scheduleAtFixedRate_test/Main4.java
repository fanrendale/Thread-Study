package com.book.ch5.knobble_1.scheduleAtFixedRate_test;

import com.book.util.TimeUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * schedule方法不具有追赶执行性：即当定时时间早于当前时间时，原本在之前时间范围内应该有的任务被取消了没有执行，
 *                              而是在当前时间开始执行。
 *
 * @author xjf
 * @date 2019/6/17 8:51
 */
public class Main4 {

    private static Timer timer = new Timer();

    public static class MyTask extends TimerTask{
        @Override
        public void run() {
            System.out.println("MyTask 开始：" + TimeUtil.nowString());
            System.out.println("MyTask 结束：" + TimeUtil.nowString());
        }
    }

    public static void main(String[] args) throws ParseException {
        MyTask myTask = new MyTask();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String specifiedTime = "2019-06-17 08:46:00";
        Date date = sdf.parse(specifiedTime);

        System.out.println("指定的时间：" + specifiedTime + "   现在时间：" + TimeUtil.nowString());

        timer.schedule(myTask,date,2000);
    }
}
