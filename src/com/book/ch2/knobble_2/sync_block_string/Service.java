package com.book.ch2.knobble_2.sync_block_string;

import com.book.util.TimeUtil;

/**
 * @Author: xjf
 * @Date: 2019/6/3 9:30
 */
public class Service {

    private String username;
    private String password;
    /**
     * 设为全局变量，在多个线程访问同步块时，“对象监视器”都为该String对象。
     */
//    private String anyString = new String();

    public void serUsernamePassword(String username, String password){
        //将String对象设置局部变量时，每个线程进来访问同步块时，同步块的”对象监视器“不是同一个对象，则不能实现同步访问
        String anyString = new String();

        try {
            synchronized (anyString) {
                System.out.println("threadName=" + Thread.currentThread().getName() + " 在 time=" +
                        TimeUtil.convertToString(System.currentTimeMillis()) + " 进入同步块");

                this.username = username;
                Thread.sleep(3000);
                this.password = password;

                System.out.println("threadName=" + Thread.currentThread().getName() + " 在 time=" +
                        TimeUtil.convertToString(System.currentTimeMillis()) + " 离开同步块");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
