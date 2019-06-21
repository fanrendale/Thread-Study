package com.book.ch7.knobble_4.format_ok2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: xjf
 * @Date: 2019/6/20 10:59
 */
public class DateTools {

    private static ThreadLocal<SimpleDateFormat> threadLocalSDF = new ThreadLocal<>();

    public static Date parse(String formatPattern, String dateString) throws ParseException {
        return new SimpleDateFormat(formatPattern).parse(dateString);
    }

    public static String format(String formatPattern, Date date) {
        return new SimpleDateFormat(formatPattern).format(date);
    }

    public static SimpleDateFormat getSimpleDateFormat(String formatPattern){
        SimpleDateFormat sdf = null;
        sdf = threadLocalSDF.get();

        if (sdf == null){
            System.out.println("新建");
            sdf = new SimpleDateFormat(formatPattern);
            threadLocalSDF.set(sdf);
        }

        return sdf;
    }
}
