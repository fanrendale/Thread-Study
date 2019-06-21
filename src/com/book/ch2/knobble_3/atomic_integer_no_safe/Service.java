package com.book.ch2.knobble_3.atomic_integer_no_safe;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @Author: xjf
 * @Date: 2019/6/7 7:55
 */
public class Service {
    public static AtomicLong count = new AtomicLong();

    /**
     * 添加synchronized使方法同步
     */
    synchronized public void addCount(){
        //此处的两处方法调用，在没加synchronized时，多个线程运行是异步的，因此会出现打印的数字不是同步正确的
        System.out.println("threadName=" + Thread.currentThread().getName() + " 加了100之后： count=" + count.addAndGet(100));
        count.addAndGet(1);
    }
}
