package com.book.ch1.get_id;

/**
 * 获取线程的id
 *
 * @Author: xjf
 * @Date: 2019/5/25 10:00
 */
public class Main {

    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + " " + thread.getId());
    }
}
