package com.book.ch5.knobble_1.scheduleAtFixedRate_test;

import com.book.util.TimeUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * scheduleAtFixedRate(TimerTask task, Date firstTime,long period):
 *      一、该方法在定时时间早于当前时间的情况下：
 *          ①如果任务执行时间小于循环间隔时间，任务下次执行开始的时间以上次任务的结束时间开始，不是以间隔时间到为准。
 *          （出现该情况是因为scheduleAtFixedRate具有追赶执行性，定时时间早于当前时间时，会将以前的任务补充执行）
 *          ②如果任务执行时间大于循环间隔时间，任务下次执行开始的时间为上次任务的结束时间。
 *
 *      二、该方法在定时时间晚于当前时间的情况下：
 *          ①如果任务执行时间小于循环间隔时间，任务下次执行开始的时间为上次任务的开始时间加上循环的间隔时间。
 *          ②如果任务执行时间大于循环间隔时间，任务下次执行开始的时间为上次任务的结束时间。
 *
 * @author xjf
 * @date 2019/6/17 8:22
 */
public class Main3 {

    private static Timer timer = new Timer();
    private static int runCount = 0;

    public static class MyTask extends TimerTask{
        @Override
        public void run() {
            try {
                runCount++;

                System.out.println("[MyTask 开始了。时间：" + TimeUtil.nowString()+"]");
                Thread.sleep(2000);
                System.out.println(" MyTask 结束了。时间：" + TimeUtil.nowString());

                if (runCount == 5){
                    timer.cancel();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws ParseException {
        MyTask myTask = new MyTask();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String specifiedTime = "2019-06-17 09:11:10";
        Date date = sdf.parse(specifiedTime);

        System.out.println("指定的时间：" + specifiedTime + "   现在时间：" + TimeUtil.nowString());

        timer.scheduleAtFixedRate(myTask,date,5000);
    }
}
