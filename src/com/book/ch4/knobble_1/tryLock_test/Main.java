package com.book.ch4.knobble_1.tryLock_test;


/**
 * tryLock():该方法是有返回值的，它表示用来尝试获取锁，如果获取成功，则返回true，如果获取失败（即锁已被其他线程获取），
 * 则返回false，这个方法无论如何都会立即返回。在拿不到锁时不会一直在那等待。
 *
 * @Author: xjf
 * @Date: 2019/6/13 14:22
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.testMethod();
            }
        };

        Thread threadA = new Thread(runnable);
        threadA.setName("A");
        threadA.start();

        Thread.sleep(1000);

        Thread threadB = new Thread(runnable);
        threadB.setName("B");
        threadB.start();
    }
}
