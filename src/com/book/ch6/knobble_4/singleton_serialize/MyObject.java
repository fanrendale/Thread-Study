package com.book.ch6.knobble_4.singleton_serialize;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @Author: xjf
 * @Date: 2019/6/18 8:32
 */
public class MyObject implements Serializable {

    private static final long serialVersionUID = -8474526085191342920L;

    //内部类方式
    private static class MyObjectHandler{
        private static MyObject myObject = new MyObject();
    }

    private MyObject() {
    }

    public static MyObject getInstance(){
        return MyObjectHandler.myObject;
    }

    /**
     * 加上该方法，能解决序列化与反序列化单例不同的问题
     * @return
     * @throws ObjectStreamException
     */
    protected Object readResolve() throws ObjectStreamException {
        System.out.println("调用了readResolve方法");
        return MyObjectHandler.myObject;
    }
}
