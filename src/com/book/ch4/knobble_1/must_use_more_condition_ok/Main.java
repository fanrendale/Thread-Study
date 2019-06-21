package com.book.ch4.knobble_1.must_use_more_condition_ok;

/**
 * 使用condition实现部分线程通知
 *
 * 在本例中线程A和线程B都等待了，但是做到了只唤醒A
 *
 * @author xjf
 * @date 2019/6/12 14:28
 */
public class Main {

    public static void main(String[] args) {
        try {
            MyService service = new MyService();

            ThreadA threadA = new ThreadA(service);
            threadA.setName("threadA");
            ThreadB threadB = new ThreadB(service);
            threadB.setName("threadB");

            threadA.start();
            threadB.start();

            Thread.sleep(3000);

            service.signalA();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
