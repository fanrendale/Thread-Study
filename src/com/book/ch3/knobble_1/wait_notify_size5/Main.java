package com.book.ch3.knobble_1.wait_notify_size5;

/**
 * 使用wait和notify来实现线程间的通信
 *
 * wait()方法可以使调用该方法的线程释放共享资源的锁，然后从运行状态退出，进入等待队列，直到被再次唤醒
 *
 * notify()方法可以随机唤醒等待队列中等待同一共享资源的“一个”线程，并使该线程退出等待队列，进入可运行状态，也就是notify()方法
 * 仅通知“一个”线程。
 *
 * notifyAll()方法可以使所有正在等待队列等待同一共享资源的“全部”线程从等待状态退出，进入可运行状态。此时，优先级最高的那个线程最先执行，
 * 但也有可能是随机执行，因为这要取决于JVM虚拟机的实现
 *
 * 个人理解：notify执行后发出通知，不过不会马上发出，需要当前方法执行完成之后才会发出，然后再有wait的方法接受的消息继续执行
 *
 * @Author: xjf
 * @Date: 2019/6/7 8:57
 */
public class Main {

    public static void main(String[] args) {
        Object lock = new Object();
        MyList list = new MyList();

        //先运行threadB，让其进入等待状态
        MyThreadB threadB = new MyThreadB(list,lock);
        threadB.setName("B");
        threadB.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        MyThreadA threadA = new MyThreadA(list,lock);
        threadA.setName("A");
        threadA.start();
    }
}
