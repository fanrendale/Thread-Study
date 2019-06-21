package com.book.ch2.knobble_2.set_new_properties_lock_one;

import com.book.util.PrintUtil;

/**
 * @Author: xjf
 * @Date: 2019/6/5 9:12
 */
public class Service {

    public void testMethod(UserInfo userInfo){
        synchronized (userInfo){
            try {
                PrintUtil.enterPrint("testMethod");
                System.out.println("[" + Thread.currentThread().getName() + "]  username=" + userInfo.getUsername());

                userInfo.setUsername("newName");
                userInfo.setPassword("456");
                Thread.sleep(3000);

                PrintUtil.leavePrint("testMethod");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
