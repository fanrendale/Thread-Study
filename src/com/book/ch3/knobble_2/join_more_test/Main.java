package com.book.ch3.knobble_2.join_more_test;

import com.book.util.PrintUtil;

/**
 * 注意可能出现的“陷阱”：join后面的方法先运行
 *
 * 有可能join后面的方法比线程B先运行
 * 原因解释：join方法总是先抢到ThreadB的锁，然后释放
 *
 *  结果可能有多种，下面分析一种：
 * 最大概率的一种结果：
 * threadName=[A] enter into methodName=[ThreadA==>run]. time=19-06-11 11:33:32
 * threadName=[A] leave methodName=[ThreadA==>run]. time=19-06-11 11:33:37
 * threadName=[main] leave methodName=[main]. time=19-06-11 11:33:37
 * threadName=[B] enter into methodName=[ThreadB==>run]. time=19-06-11 11:33:37
 * threadName=[B] leave methodName=[ThreadB==>run]. time=19-06-11 11:33:42
 *
 * 解释：
 * 1）b.join(2000)方法先抢到B锁，然后将B锁进行释放；
 * 2）ThreadA抢到锁，打印ThreadA begin并且sleep(5000);
 * 3）ThreadA打印ThreadA end，并释放锁；
 * 4）这时join(2000)和ThreadB争抢锁，而join(2000）再次抢到锁，发现时间已过，释放锁后打印main离开；
 * 5）ThreadB抢到锁打印ThreadB begin；
 * 6）5秒之后再打印ThreadB end
 *
 * @Author: xjf
 * @Date: 2019/6/11 11:19
 */
public class Main {

    public static void main(String[] args) {
        try {
            ThreadB threadB = new ThreadB();
            ThreadA threadA = new ThreadA(threadB);

            threadA.setName("A");
            threadB.setName("B");

            threadA.start();
            threadB.start();
            //有可能join后面的方法比线程B先运行
            //因为此处按理说是先运行线程B，再等2s运行后面的打印语句
            threadB.join(2000);

            PrintUtil.leavePrint("main");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
