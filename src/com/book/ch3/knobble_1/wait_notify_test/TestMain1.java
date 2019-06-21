package com.book.ch3.knobble_1.wait_notify_test;

/**
 * 测试wait
 * @Author: xjf
 * @Date: 2019/6/7 11:05
 */
public class TestMain1 {

    public static void main(String[] args) {
        try {
            String newString = new String("");

            newString.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
