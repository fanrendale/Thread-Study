package com.book.ch6.knobble_5.singleton_static_block;

/**
 * 使用静态块实现单例模式
 *
 * @Author: xjf
 * @Date: 2019/6/18 8:55
 */
public class MyObject {

    private static MyObject myObject = null;

    private MyObject() {
    }

    static {
        myObject = new MyObject();
    }

    public static MyObject getInstance(){
        return myObject;
    }
}
