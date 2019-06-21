package com.book.ch6.knobble_2.singleton_lazy_dcl;

/**
 * @Author: xjf
 * @Date: 2019/6/17 16:50
 */
public class MyObject {

    private volatile static MyObject myObject;

    private MyObject() {
    }

    /**
     * 使用双重检测机制来使用单例同步，同时让代码异步
     * @return
     */
    public static MyObject getInstance(){

        try {
            if (myObject == null){

                //模拟在创建对象之前做一些准备工作
                Thread.sleep(3000);
                synchronized (MyObject.class){
                    if (myObject == null){
                        myObject = new MyObject();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return myObject;
    }
}
