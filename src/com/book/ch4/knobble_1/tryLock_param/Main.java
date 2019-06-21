package com.book.ch4.knobble_1.tryLock_param;

/**
 * tryLock(long timeout, TimeUnit unit)方法：会在执行的时间里尝试获取锁，如果锁没有被其他线程获取，
 *      则可以获取锁。否则，指定的等待时间还没获取锁则不再等待，并且返回false
 *
 * @Author: xjf
 * @Date: 2019/6/13 14:45
 */
public class Main {

    public static void main(String[] args) {
        Service service = new Service();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.testMethod();
            }
        };

        Thread threadA = new Thread(runnable);
        threadA.setName("A");
        threadA.start();

        Thread threadB = new Thread(runnable);
        threadB.setName("B");
        threadB.start();
    }
}
