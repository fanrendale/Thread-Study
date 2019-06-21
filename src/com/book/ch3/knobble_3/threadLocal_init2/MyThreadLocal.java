package com.book.ch3.knobble_3.threadLocal_init2;

import java.util.Date;

/**
 * @Author: xjf
 * @Date: 2019/6/11 15:51
 */
public class MyThreadLocal extends ThreadLocal {

    /**
     * 给ThreadLocal变量设置默认值
     * @return
     */
    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }
}
