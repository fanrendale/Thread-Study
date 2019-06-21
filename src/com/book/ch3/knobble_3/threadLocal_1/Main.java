package com.book.ch3.knobble_3.threadLocal_1;

/**
 * @Author: xjf
 * @Date: 2019/6/11 11:45
 */
public class Main {
    public static ThreadLocal t1 = new ThreadLocal();

    public static void main(String[] args) {
        if (t1.get() == null){
            System.out.println("从未放过值");
            t1.set("咖啡");
        }

        System.out.println(t1.get());
        System.out.println(t1.get());
    }
}
