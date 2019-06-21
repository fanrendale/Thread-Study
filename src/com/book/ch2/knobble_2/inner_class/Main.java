package com.book.ch2.knobble_2.inner_class;

/**
 * 测试内部类和静态内部类
 * @Author: xjf
 * @Date: 2019/6/4 15:39
 */
public class Main {

    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        publicClass.setUsername("usernameValue");
        publicClass.setPassword("passwordValue");

        System.out.println("publicClass: " + publicClass.getUsername() + "  " + publicClass.getPassword());

        PublicClass.PrivateClass privateClass = new PublicClass.PrivateClass();
        privateClass.setAge("ageValue");
        privateClass.setAddress("addressValue");
        System.out.println("privateClass: " + privateClass.getAge() + "  " + privateClass.getAddress());
        privateClass.printPublicProperty();

    }
}
