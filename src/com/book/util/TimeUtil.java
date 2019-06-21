package com.book.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间格式化工具类
 * @Author: xjf
 * @Date: 2019/5/30 15:31
 */
public class TimeUtil {

    /**
     * 将时间戳转换为年月日 时分秒的的String
     * @param timeMills
     * @return
     */
    public static String convertToString(long timeMills){
        SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
        return sdf.format(new Date(timeMills));
    }

    /**
     * 获取当前时间的 年月日 时分秒的的String
     * @return
     */
    public static String nowString(){
        SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
        return sdf.format(new Date(System.currentTimeMillis()));
    }
}
