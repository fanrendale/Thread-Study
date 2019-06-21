package com.book.ch6.knobble_1.singleton_0;

/**
 *
 * @Author: xjf
 * @Date: 2019/6/17 11:54
 */
public class MyObject {
    //立即加载====》饿汉模式
    private static MyObject myObject = new MyObject();

    private MyObject() {
    }

    public static MyObject getInstance(){

        //此代码版本为立即加载
        //此版本代码的缺点是不能有其他实例变量
        //由于getInstance()方法没有同步
        //所以可能出现非线程安全的问题
        return myObject;
    }
}
