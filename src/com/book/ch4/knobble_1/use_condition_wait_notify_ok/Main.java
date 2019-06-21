package com.book.ch4.knobble_1.use_condition_wait_notify_ok;

/**
 * 正确使用condition对象实现等待和通知功能
 *
 * @author xjf
 * @date 2019/6/12 11:44
 */
public class Main {

    public static void main(String[] args) {
        try {
            MyService service = new MyService();

            ThreadA threadA = new ThreadA(service);
            threadA.start();

            Thread.sleep(3000);

            service.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
