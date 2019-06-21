package com.book.ch1.current_thread_ext;

/**
 * @author xjf
 * @date 2019/5/24 17:24
 */
public class Main {
    public static void main(String[] args) {
        CountOperate countOperate = new CountOperate();
        Thread thread = new Thread(countOperate);
        thread.setName("A");
        thread.start();
        System.out.println("=====================");
        countOperate.run();
        System.out.println("=====================");

    }
}
