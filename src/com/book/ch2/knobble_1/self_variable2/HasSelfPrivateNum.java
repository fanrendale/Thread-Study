package com.book.ch2.knobble_1.self_variable2;

/**
 * @Author: xjf
 * @Date: 2019/5/28 19:15
 */
public class HasSelfPrivateNum {

    private int num = 0;

    /**
     * 添加synchronized使方法同步执行
     */
    synchronized public void test(String username){
        try {
            if ("a".equals(username)){
                num = 100;
                System.out.println("a set num over!");
                Thread.sleep(2000);
            }

            if ("b".equals(username)){
                num = 200;
                System.out.println("b set num over");
            }

            System.out.println("username=" + username + "   num=" + num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
