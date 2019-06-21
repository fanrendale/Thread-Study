package com.book.ch7.knobble_4.format_error;

import java.text.SimpleDateFormat;

/**
 * 验证SimpleDateFormat的线程不安全
 *
 * @Author: xjf
 * @Date: 2019/6/20 9:50
 */
public class Main {

    public static void main(String[] args) {
        //如果SimpleDateFormat写在这儿，则所有的线程都使用的是同一个，会线程不安全
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        String[] dateArray = new String[]{
                "2019-01-01","2019-01-02","2019-01-03","2019-01-04","2019-01-05",
                "2019-01-06","2019-01-07","2019-01-08","2019-01-09","2019-01-10"
        };

        MyThread[] threadArray = new MyThread[10];

        for (int i = 0; i < threadArray.length; i++) {
            //解决SimpleDateFormat线程不安全，每个线程使用一个新的对象
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            threadArray[i] = new MyThread(sdf,dateArray[i]);
        }

        for (int i = 0; i < threadArray.length; i++) {
            threadArray[i].start();
        }

    }
}
