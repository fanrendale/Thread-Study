package com.book.ch2.knobble_1.self_variable;

/**
 * 方法内的变量永远是线程安全的
 *
 * 原因：
 * （1）方法内部的变量为方法私有的变量，其生存周期随着方法的结束而终结。
 * （2）每个线程执行的时候会把局部变量存放在各自栈帧的工作内存中（栈帧进入虚拟机栈），虚拟机栈线程间不共享，故不存在线程安全问题。
 * @Author: xjf
 * @Date: 2019/5/28 12:46
 */
public class Main {

    public static void main(String[] args) {
        HasSelfPrivateNum privateNum = new HasSelfPrivateNum();
        MyThreadA threadA = new MyThreadA(privateNum);
        MyThreadB threadB = new MyThreadB(privateNum);

        threadA.start();
        threadB.start();

    }
}
