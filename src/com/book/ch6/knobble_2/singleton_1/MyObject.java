package com.book.ch6.knobble_2.singleton_1;

/**
 * 单例模式======》懒汉模式
 *
 * @Author: xjf
 * @Date: 2019/6/17 16:03
 */
public class MyObject {

    private static MyObject myObject;

    private MyObject() {
    }

    public static MyObject getInstance(){
        if (myObject == null){
            myObject = new MyObject();
        }

        return myObject;
    }
}
