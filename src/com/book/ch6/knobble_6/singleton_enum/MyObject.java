package com.book.ch6.knobble_6.singleton_enum;

import java.sql.*;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

/**
 * @Author: xjf
 * @Date: 2019/6/18 11:03
 */
public enum MyObject {
    connectionFactory;
    private Object object;

    private MyObject(){
        System.out.println("创建对象");
        object = new Object();
    }

    public Object getObject() {
        return object;
    }

}
