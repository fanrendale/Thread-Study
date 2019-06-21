package com.book.ch4.knobble_1.use_condition_wait_notify_error;

/**
 * 测试condition对象的使用,调用await方法后当前线程会进入WAITING状态
 *
 * 在调用condition.await()时如果不加lock.lock(),会出现IllegalMonitorStateException异常，代表无监视器对象
 * 调用lock()方法才会获取监视器对象
 *
 * @author xjf
 * @date 2019/6/12 11:23
 */
public class Main {

    public static void main(String[] args) {
        MyService service = new MyService();

        ThreadA threadA = new ThreadA(service);
        threadA.start();
    }
}
