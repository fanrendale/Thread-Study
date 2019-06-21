package com.book.ch6.knobble_6.singleton_enum_2;

/**
 * @Author: xjf
 * @Date: 2019/6/18 11:03
 */
public class MyObject {

    public enum MyEnumSingleton{
        connectionFactory;
        private Object object;

        private MyEnumSingleton(){
            System.out.println("创建对象");
            object = new Object();
        }

        public Object getObject() {
            return object;
        }
    }

    public static Object getObject(){
        return MyEnumSingleton.connectionFactory.getObject();
    }
}
