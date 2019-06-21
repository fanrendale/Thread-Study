package com.book.ch1.stop_data_unsafe;

/**
 * @Author: xjf
 * @Date: 2019/5/25 14:23
 */
public class SynchronizedObject {
    private String username = "a";
    private String password = "AA";

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 同步赋值
     */
    synchronized public void printString(String username,String password){
        try {
            this.username = username;
            Thread.sleep(10000);
            this.password = password;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
