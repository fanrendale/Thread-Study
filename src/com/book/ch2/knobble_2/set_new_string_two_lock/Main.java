package com.book.ch2.knobble_2.set_new_string_two_lock;

/**
 * 测试锁对象的改变
 *
 * 刚开始threadA使用的lock是“123”，执行后将String改为了“456”，然后睡眠3s
 * 而再50ms后开始执行threadB，这时lock成为了“456”，两个线程的锁对象不是同一个，将异步执行
 *
 * @Author: xjf
 * @Date: 2019/6/5 9:02
 */
public class Main {

    public static void main(String[] args) {
        Service service = new Service();

        ThreadA threadA = new ThreadA(service);
        threadA.setName("A");
        threadA.start();

        try {
            //如果将该睡眠去掉，则threadA和threadB都使用的锁对象是“123”，将会同步执行
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ThreadB threadB = new ThreadB(service);
        threadB.setName("B");
        threadB.start();
    }
}
