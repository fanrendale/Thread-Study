package com.book.ch2.knobble_2.set_new_properties_lock_one;

/**
 * 当两个线程的锁对象为同一个对象时，对象的属性改变不会对使用该对象作为“对象监视器”有影响
 * 即两个线程的锁对象不变，两个线程还是同步执行
 *
 * （只要对象不变，就是同步效果）
 *
 * @Author: xjf
 * @Date: 2019/6/5 9:14
 */
public class Main {

    public static void main(String[] args) {
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername("oldName");
        userInfo.setPassword("123");

        Service service = new Service();

        ThreadA threadA = new ThreadA(userInfo,service);
        threadA.setName("A");
        threadA.start();

        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ThreadB threadB = new ThreadB(userInfo,service);
        threadB.setName("B");
        threadB.start();
    }
}
