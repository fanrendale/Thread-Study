package com.book.ch2.knobble_1.sync_not_extends;

import com.book.util.TimeUtil;

/**
 * @Author: xjf
 * @Date: 2019/5/30 17:07
 */
public class Son extends Parent {

    /**
     * 子类不能继承同步，需要在子类方法加上synchronized
     */
    @Override
    synchronized public void parentMethod() {
        try {
            System.out.println("threadName=" + Thread.currentThread().getName() + " . ===son begin===" +
                    " . time=" + TimeUtil.convertToString(System.currentTimeMillis()));
            Thread.sleep(3000);
            System.out.println("threadName=" + Thread.currentThread().getName() + " . ===son end===" +
                    " . time=" + TimeUtil.convertToString(System.currentTimeMillis()));

            //调用父级方法
            super.parentMethod();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
