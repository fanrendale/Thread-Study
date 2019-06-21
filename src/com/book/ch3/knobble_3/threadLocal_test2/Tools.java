package com.book.ch3.knobble_3.threadLocal_test2;

import java.util.Date;

/**
 * @Author: xjf
 * @Date: 2019/6/11 15:38
 */
public class Tools {
    public static ThreadLocal<Date> localValue = new ThreadLocal<>();
}
