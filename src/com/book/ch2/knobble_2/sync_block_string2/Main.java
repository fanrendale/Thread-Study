package com.book.ch2.knobble_2.sync_block_string2;

/**
 * 同步块和同步方法的对象监视器不是同一个对象时，运行时异步的
 * @Author: xjf
 * @Date: 2019/6/3 10:06
 */
public class Main {

    public static void main(String[] args) {
        Service service = new Service();

        ThreadA threadA = new ThreadA(service);
        ThreadB threadB = new ThreadB(service);

        threadA.start();
        threadB.start();
    }
}
