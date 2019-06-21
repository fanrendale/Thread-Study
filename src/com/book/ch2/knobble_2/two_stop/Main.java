package com.book.ch2.knobble_2.two_stop;

/**
 * 多个线程调用同一个对象的不同synchronized方法时，多个方法的“对象监视器”都是同一个对象，
 * 如果某一个方法一直执行，则其他方法将只能等待阻塞，可能永远也运行不到了。
 *
 * 解决同步方法无线等待：将synchronized放在方法上改为synchronized块，并将“对象监视器”设置为
 * 不同的对象，则两个方法可以异步执行，不会存在无线等待。
 *
 * @Author: xjf
 * @Date: 2019/6/4 13:54
 */
public class Main {

    public static void main(String[] args) {
        Service service = new Service();

        MyThreadA threadA = new MyThreadA(service);
        threadA.setName("A");
        threadA.start();

        MyThreadB threadB = new MyThreadB(service);
        threadB.setName("B");
        threadB.start();
    }
}
