package com.book.ch2.knobble_3.atomic_integer_no_safe;

/**
 * 虽然原子类AtomicLong的执行是原子性的，但是方法的调用却不是原子性的，所有会出现打印的数字不是同步正确的
 *
 * 解决办法：在数字操作方法上加上synchronized
 *
 * @Author: xjf
 * @Date: 2019/6/7 7:59
 */
public class Main {

    public static void main(String[] args) {
        Service service = new Service();
        MyThread[] threads = new MyThread[5];

        for (int i = 0; i < 5; i++) {
            threads[i] = new MyThread(service);
        }

        for (int i = 0; i < 5; i++) {
            threads[i].start();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Service.count.get());

    }
}
