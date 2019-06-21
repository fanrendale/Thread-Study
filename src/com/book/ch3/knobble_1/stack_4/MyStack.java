package com.book.ch3.knobble_1.stack_4;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xjf
 * @Date: 2019/6/9 16:48
 */
public class MyStack {

    private List list = new ArrayList();

    /**
     * 放值
     */
    synchronized public void push(){
        try {
            //将if改为while解决一个生产者对应多个消费者时报错
            /*if*/ while (list.size() == 1){
                System.out.println("push线程:"+Thread.currentThread().getName()+" waiting");
                this.wait();
            }

//            System.out.println("push线程被唤醒了");
            String value = System.currentTimeMillis() + "_" + System.nanoTime();
            list.add(value);
            System.out.println("push size=" + list.size());
//            this.notify();
            this.notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public String pop(){
        String returnValue = "";

        try {
            //将if改为while解决一个生产者对应多个消费者时报错
            /*if*/while (list.size() == 0){
                System.out.println("pop线程：" + Thread.currentThread().getName() + " waiting");
                this.wait();
            }

//            System.out.println("ThreadName=" + Thread.currentThread().getName() + " 被唤醒了");
            returnValue = list.get(0).toString();
            list.remove(0);
            System.out.println("pop size=" + list.size());
//            this.notify();
            this.notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return returnValue;
    }
}
