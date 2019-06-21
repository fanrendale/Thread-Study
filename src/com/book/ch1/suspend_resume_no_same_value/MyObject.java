package com.book.ch1.suspend_resume_no_same_value;

/**
 * @Author: xjf
 * @Date: 2019/5/27 12:38
 */
public class MyObject {

    private String username = "a";
    private String password = "AA";

    public void setValue(String username, String password){
        this.username = username;
        if ("b".equals(username)){
            System.out.println("停止b线程");
            Thread.currentThread().suspend();
        }

        this.password = password;
    }

    public void printValue(){
        System.out.println("username: " + username + "   password: " + password);
    }
}
