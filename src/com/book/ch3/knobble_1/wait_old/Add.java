package com.book.ch3.knobble_1.wait_old;


/**
 * 加法
 * @Author: xjf
 * @Date: 2019/6/8 8:56
 */
public class Add {
    private String lock;

    public Add(String lock) {
        this.lock = lock;
    }

    public void add(){
        synchronized (lock){
            ValueObject.list.add("咖啡");
            lock.notifyAll();
        }

    }
}
