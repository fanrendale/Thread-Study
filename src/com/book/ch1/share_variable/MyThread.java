package com.book.ch1.share_variable;

/**
 * @Author: xjf
 * @Date: 2019/5/23 10:23
 */
public class MyThread extends Thread {

    private int count = 5;

    public MyThread(String name) {
        this.setName(name);
    }

    //上锁之后就能顺序执行
    @Override
    synchronized public void run() {
        //此处如果使用了循环，则一个线程可能会执行多次减法
//        while (count > 0){
            count--;
            System.out.println("由线程：" + Thread.currentThread().getName() + "计算, count = " +
                    count);
//        }
    }
}
