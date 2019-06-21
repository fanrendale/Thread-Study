package com.book.ch3.knobble_2.join_execption;

// TODO: 2019/6/10 存在一个问题，猜想了可能原因
/**
 * 在join过程中，如果当前线程对象被中断，则当前线程出现异常
 *
 * 主方法设置睡眠时间为1000或以上时，不能正确中断的原因猜想：由于线程A一直循环执行并且很快速，可能是因为线程A一直在执行，
 * 没有释放CPU，则线程C一直没有机会执行，导致不能正确中断。
 * 
 * @Author: xjf
 * @Date: 2019/6/10 11:29
 */
public class Main {

    public static void main(String[] args) {
        try {
            ThreadB threadB = new ThreadB();
            threadB.start();

            //此处的睡眠时间设置为500时，能正常执行线程C并在B抛出中断异常
            //如果设置为1000时，C线程没有执行，线程B也没有中断
            Thread.sleep(500);

            ThreadC threadC = new ThreadC(threadB);
            threadC.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
