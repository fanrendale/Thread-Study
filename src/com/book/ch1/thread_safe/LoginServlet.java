package com.book.ch1.thread_safe;

/**
 * 本类模拟一个Servlet组件
 *
 * @author xjf
 * @date 2019/5/24 14:15
 */
public class LoginServlet {
    private static String usernameRef;
    private static String passwordRef;

    //加锁，可以解决线程不安全问题
    synchronized public static void doPost(String username,String password){
        try {
            usernameRef = username;

            if ("a".equals(username)){
                Thread.sleep(3000);
            }

            passwordRef = password;

            System.out.println("username = " + usernameRef + " password = " + passwordRef);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
