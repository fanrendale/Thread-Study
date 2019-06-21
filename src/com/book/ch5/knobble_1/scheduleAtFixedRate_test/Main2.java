package com.book.ch5.knobble_1.scheduleAtFixedRate_test;

import com.book.util.TimeUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * schedule(TimerTask task, Date firstTime, long period):该方法在有延时的情况下（任务执行时间没有大于间隔时间），间隔时间过后的下次执行时间，
 * 是根据上一次任务的结束时间算，为下一次任务的开始执行时间
 *
 * @Author: xjf
 * @Date: 2019/6/16 22:11
 */
public class Main2 {

    private static Timer timer = new Timer();
    private static int runCount = 0;

    public static class MyTask extends TimerTask{
        @Override
        public void run() {
            try {
                runCount++;
                System.out.println("MyTask begin: " + TimeUtil.nowString());
                //大于间隔时间3000，会存在延时
                Thread.sleep(5000);
                System.out.println("MyTask end  : " + TimeUtil.nowString());

                //如果任务执行了5次，则停止timer的任务
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
        String specifiedTime = "2019-06-16 22:22:00";
        Date date = sdf.parse(specifiedTime);

        System.out.println("任务开始时间：" + specifiedTime + "     现在时间：" + TimeUtil.nowString());

        timer.schedule(myTask,date,3000);
    }
}
