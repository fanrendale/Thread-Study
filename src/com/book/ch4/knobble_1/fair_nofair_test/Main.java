package com.book.ch4.knobble_1.fair_nofair_test;

/**
 * 测试公平锁和非公平锁
 *
 * 锁Lock分为“公平锁”和“非公平锁”，公平锁表示线程获取锁的顺序是按照线程加锁的顺序来分配的，即先来先得的FIFO先进先出顺序。
 * 而非公平锁就是一种获取锁的抢占机制，是随机获得锁的，和公平锁不一样的就是先来的不一定先得到锁，这个方式可能造成某些线程一直
 * 拿不到锁，结果也就是不公平的了。
 *
 * 个人理解：当有十个线程执行时，如果是公平锁:则这十个线程的启动顺序和取得锁的顺序基本一致；如果是非公平锁：则顺序不一定一致。
 *
 * @Author: xjf
 * @Date: 2019/6/13 9:17
 */
public class Main {

    public static void main(String[] args) {
        //公平锁
        Service service = new Service(true);
        //非公平锁
//        Service service = new Service(false);

        ThreadA[] threadAS = new ThreadA[10];

        for (int i = 0; i < threadAS.length; i++) {
            threadAS[i] = new ThreadA(service);
        }

        for (int i = 0; i < threadAS.length; i++) {
            threadAS[i].start();
        }
    }
}
