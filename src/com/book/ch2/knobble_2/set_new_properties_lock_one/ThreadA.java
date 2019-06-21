package com.book.ch2.knobble_2.set_new_properties_lock_one;

/**
 * @Author: xjf
 * @Date: 2019/6/5 9:13
 */
public class ThreadA extends Thread {

    private UserInfo userInfo;
    private Service service;

    public ThreadA(UserInfo userInfo, Service service) {
        this.userInfo = userInfo;
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod(userInfo);
    }
}
