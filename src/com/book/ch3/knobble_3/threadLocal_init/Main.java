package com.book.ch3.knobble_3.threadLocal_init;

/**
 * @Author: xjf
 * @Date: 2019/6/11 15:53
 */
public class Main {

    public static MyThreadLocal localValue = new MyThreadLocal();

    public static void main(String[] args) {
        if (localValue.get() == "null"){
            localValue.set("main方法里面设置的值");
        }

        System.out.println(localValue.get());
        System.out.println(localValue.get());
    }
}
