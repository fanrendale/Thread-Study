package com.book.ch3.knobble_1.stack_1;

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
            if (list.size() == 1){
                this.wait();
            }

            String value = System.currentTimeMillis() + "_" + System.nanoTime();
            list.add(value);
            System.out.println("push size=" + list.size());
            this.notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public String pop(){
        String returnValue = "";

        try {
            if (list.size() == 0){
                System.out.println("pop waiting! ThreadName=" + Thread.currentThread().getName());
                this.wait();
            }

            returnValue = list.get(0).toString();
            list.remove(0);
            System.out.println("pop size=" + list.size());
            this.notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return returnValue;
    }
}
