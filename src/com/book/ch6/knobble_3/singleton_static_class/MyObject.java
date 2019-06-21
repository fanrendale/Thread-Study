package com.book.ch6.knobble_3.singleton_static_class;

/**
 * @Author: xjf
 * @Date: 2019/6/17 17:09
 */
public class MyObject {

    //内部类方式
    public static class MyObjectHandler{
        private static MyObject myObject = new MyObject();
    }

    private MyObject() {
    }

    public static MyObject getInstance(){
        return MyObjectHandler.myObject;
    }
}
