package com.book.ch7.knobble_6.thread_group_1;

/**
 * @Author: xjf
 * @Date: 2019/6/21 9:12
 */
public class MyThread extends Thread {

    private String num;

    public MyThread(ThreadGroup threadGroup, String name, String num) {
        super(threadGroup,name);
        this.num = num;
    }

    @Override
    public void run() {
        try {
            int numInt = Integer.parseInt(num);
            while (true){
                System.out.println("死循环中：" + Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
