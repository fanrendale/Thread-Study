package com.book.ch7.knobble_4.format_ok1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: xjf
 * @Date: 2019/6/20 9:47
 */
public class MyThread extends Thread {

    private SimpleDateFormat sdf;
    private String intputDateString;

    public MyThread(SimpleDateFormat sdf, String intputDateString) {
        this.sdf = sdf;
        this.intputDateString = intputDateString;
    }

    @Override
    public void run() {
        try {
            Date tempDate = DateTools.parse("yyyy-MM-dd",intputDateString);
            String newDateString = DateTools.format("yyyy-MM-dd",tempDate);

            if (!newDateString.equals(intputDateString)){
                System.out.println("ThreadName=" + Thread.currentThread().getName() +
                        "报错了。 输入的时间字符串：" + intputDateString +
                        "  转换成的时间字符串：" + newDateString);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
