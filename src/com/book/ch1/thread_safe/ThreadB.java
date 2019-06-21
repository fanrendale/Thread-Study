package com.book.ch1.thread_safe;

/**
 * @author xjf
 * @date 2019/5/24 15:10
 */
public class ThreadB extends Thread {

    @Override
    public void run() {
        LoginServlet.doPost("b","bb");
    }
}
