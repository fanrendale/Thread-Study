package com.book.ch3.knobble_4.inheritabelThreadLocal_test2;

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

    @Override
    protected Object childValue(Object parentValue) {
        return parentValue + "---在子线程增加的";
    }
}
