package com.book.ch4.knobble_1.must_use_more_condition_error;

/**
 * 使用condition实现部分线程通知（唤醒）：错误示例
 *
 * 本例中会唤醒所有的线程
 *
 * @author xjf
 * @date 2019/6/12 13:58
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

            service.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
