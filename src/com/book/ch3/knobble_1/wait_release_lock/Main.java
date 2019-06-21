package com.book.ch3.knobble_1.wait_release_lock;

/**
 * 验证wait()方法执行后会释放锁
 *
 * @Author: xjf
 * @Date: 2019/6/7 13:45
 */
public class Main {

    public static void main(String[] args) {
        Service service = new Service();

        ThreadA threadA = new ThreadA(service);
        threadA.start();

        ThreadB threadB = new ThreadB(service);
        threadB.start();
    }
}
