package com.book.ch7.knobble_4.format_ok2;

import java.text.SimpleDateFormat;

/**
 * 解决SimpleDateFormat的线程不安全
 *
 * 使用ThreadLocal变量
 *
 * @Author: xjf
 * @Date: 2019/6/20 9:50
 */
public class Main {

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        String[] dateArray = new String[]{
                "2019-01-01","2019-01-02","2019-01-03","2019-01-04","2019-01-05",
                "2019-01-06","2019-01-07","2019-01-08","2019-01-09","2019-01-10"
        };

        MyThread[] threadArray = new MyThread[10];

        for (int i = 0; i < threadArray.length; i++) {
            threadArray[i] = new MyThread(sdf,dateArray[i]);
        }

        for (int i = 0; i < threadArray.length; i++) {
            threadArray[i].start();
        }

    }
}
