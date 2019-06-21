package com.book.ch2.knobble_1.self_variable;

/**
 * @Author: xjf
 * @Date: 2019/5/28 12:43
 */
public class HasSelfPrivateNum {

    public void test(String username,int value){
        int num = 0;

        if ("a".equals(username)){
            System.out.println("a set num over");
            num = value;
        }else if ("b".equals(username)){
            System.out.println("b set num over");
            num = value;
        }

        System.out.println("username: " + username + "   num: " + num);
    }
}
