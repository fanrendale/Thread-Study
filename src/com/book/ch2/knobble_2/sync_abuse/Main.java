package com.book.ch2.knobble_2.sync_abuse;

/**
 * 测试synchronized声明方法是有弊端的：
 *
 * synchronized修饰的方法，当有一个线程在调用时，其他线程只能一直处于等待状态，
 * 如果方法的调用时间比较长，则会造成同步运行时间很长。
 * @Author: xjf
 * @Date: 2019/5/31 9:59
 */
public class Main {

    public static void main(String[] args) {
        try {
            //运行
            Task task = new Task();

            MyThreadA threadA = new MyThreadA(task);
            threadA.setName("ThreadA");
            threadA.start();

            MyThreadB threadB = new MyThreadB(task);
            threadB.setName("ThreadB");
            threadB.start();

            Thread.sleep(10000);

            //计算时间
            long startTime = Math.min(CommonUtils.startTime1,CommonUtils.startTime2);
            long endTime = Math.max(CommonUtils.endTime1,CommonUtils.endTime2);

            System.out.println("耗时：" + (endTime-startTime)/ 1000 + "s");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
