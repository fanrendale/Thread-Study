package com.book.ch2.knobble_3.synchronized_update_new_value;

/**
 * synchronized可以解决多线程运行时私有堆栈变量和公共堆栈变量不一致的问题
 *
 * 关键字synchronized可以保证在同一时刻，只有一个线程可以执行某一个方法或某一个代码块。它包含两个特征： 互斥性和可见性。
 *
 * 同步synchronized不仅可以解决一个线程看到对象处于不一致的状态，还可以保证进入同步方法或者同步代码块的每个线程，都看到由同一个锁
 * 保护之前所有的修改效果
 *
 * “外练互斥，内修可见”
 *
 * @Author: xjf
 * @Date: 2019/6/7 8:25
 */
public class Main {

    public static void main(String[] args) {
        Service service = new Service();

        MyThreadA threadA = new MyThreadA(service);
        threadA.setName("A");
        threadA.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        MyThreadB threadB = new MyThreadB(service);
        threadB.setName("B");
        threadB.start();
    }
}
