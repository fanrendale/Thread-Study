package com.book.ch2.knobble_2.sync_out_async;

import java.util.ArrayList;
import java.util.List;

/**
 * 多个线程调用两个同步方法的顺序是异步的，虽然同步方法的执行内部是同步的，但是线程调用方法是随机的
 * 有可能出现“脏读”的情况
 * @Author: xjf
 * @Date: 2019/6/3 10:30
 */
public class MyList {

    private List list = new ArrayList();

    synchronized public void add(String username){
        System.out.println("threadName=" + Thread.currentThread().getName() + " 执行了add方法");
        list.add(username);
        System.out.println("threadName=" + Thread.currentThread().getName() + " 离开了add方法");
    }

    synchronized public void getSize(){
        System.out.println("threadName=" + Thread.currentThread().getName() + " 执行了getSize方法");
        int sizeValue = list.size();
        System.out.println("threadName=" + Thread.currentThread().getName() + " 离开了getSize方法");
    }
}
