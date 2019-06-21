package com.book.ch1.interrupt;

/**
 * @Author: xjf
 * @Date: 2019/5/25 13:16
 */
public class Main2 {

    public static void main(String[] args) {

        Thread.currentThread().interrupt();
        System.out.println("name1: " + Thread.currentThread().getName());
        System.out.println("是否停止1？ = " + Thread.interrupted());
        System.out.println("是否停止2？ = " + Thread.interrupted());
        System.out.println("end!");
    }
}
