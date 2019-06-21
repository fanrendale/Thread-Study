package com.book.ch2.knobble_1.throw_exception_no_lock;

/**
 * 当一个线程执行的代码出现异常时，其所持有的锁会自动释放
 * @Author: xjf
 * @Date: 2019/5/30 15:48
 */
public class Main {

    public static void main(String[] args) {
        Service service = new Service();

        MyThreadA threadA = new MyThreadA(service);
        threadA.setName("a");
        threadA.start();

        MyThreadB threadB = new MyThreadB(service);
        threadB.setName("b");
        threadB.start();
    }
}
