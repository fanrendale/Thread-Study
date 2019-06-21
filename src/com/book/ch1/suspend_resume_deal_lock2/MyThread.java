package com.book.ch1.suspend_resume_deal_lock2;

/**
 * @Author: xjf
 * @Date: 2019/5/27 11:52
 */
public class MyThread extends Thread {
    private int i;

    @Override
    public void run() {
        while (true){
            i++;
            //加了该句打印后，主方法的"main end!"不会被打印出来，原因：
            //System.out.println()方法的源码如下；该方法有同步锁，
            // 当使用suspend暂停后，同步锁没有被释放，因此主方法打印不了
            //
            //synchronized (this) {
            //            print(x);
            //            newLine();
            //        }
            System.out.println(i);
        }
    }
}
