package com.book.ch6.knobble_2.singleton_lazy_error;

/**
 * @Author: xjf
 * @Date: 2019/6/17 16:17
 */
public class MyObject {

    private static MyObject myObject;

    private MyObject() {
    }

    //同步锁加在方法上效率低
    /*synchronized*/ public static MyObject getInstance(){

        //使用同步块的效率一样低
//        synchronized (MyObject.class){
            try {
                if (myObject == null){
                    //模拟在创建实例前的准备
                    Thread.sleep(3000);

                    //同步锁加在这儿，不能解锁多线程的问题
//                    synchronized (MyObject.class){
                        myObject = new MyObject();
//                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//        }


        return myObject;
    }
}
