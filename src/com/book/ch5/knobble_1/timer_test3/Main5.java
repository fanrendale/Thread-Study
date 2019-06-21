package com.book.ch5.knobble_1.timer_test3;

import com.book.util.TimeUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 *  Timer的cancel应该是取消任务，但是本例中有些任务却执行了
 *  原因：cancel()方法有时没有争抢到queue锁，所以TimerTask类中的任务继续正常执行
 *
 * @Author: xjf
 * @Date: 2019/6/15 9:37
 */
public class Main5 {

    public static int i = 0;

    public static class MyTask extends TimerTask{

        @Override
        public void run() {
            System.out.println("MyTask运行了，时间：" + TimeUtil.nowString() + "    i=" + i);
        }
    }

    public static void main(String[] args) throws ParseException {
        while (true){
            i++;
            Timer timer = new Timer();
            MyTask myTask = new MyTask();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String specifiedTime = "2019-06-15 09:36:00";
            Date date = sdf.parse(specifiedTime);

            timer.schedule(myTask,date);
            timer.cancel();
        }
    }
}
