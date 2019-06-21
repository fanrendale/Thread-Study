package com.book.ch2.knobble_1.dirty_read;

/**
 * @Author: xjf
 * @Date: 2019/5/30 9:55
 */
public class PublicVar {

    private String username = "A";
    private String password = "AA";

    synchronized public void setValue(String username, String password){
        try {
            this.username = username;
            Thread.sleep(3000);

            this.password = password;

            System.out.println(Thread.currentThread().getName() + " setValue: username=" + this.username +
                    " password=" + this.password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 加上同步后，赋值和取值都是同步的，则能避免脏读的情况
     */
    synchronized public void getValue(){
        System.out.println(Thread.currentThread().getName() + " getValue: username=" + this.username +
                " password=" + this.password);
    }
}
