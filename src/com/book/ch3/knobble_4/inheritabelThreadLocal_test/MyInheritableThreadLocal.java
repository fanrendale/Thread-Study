package com.book.ch3.knobble_4.inheritabelThreadLocal_test;

import java.util.Date;

/**
 * @Author: xjf
 * @Date: 2019/6/11 17:19
 */
public class MyInheritableThreadLocal extends InheritableThreadLocal {

    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }
}
