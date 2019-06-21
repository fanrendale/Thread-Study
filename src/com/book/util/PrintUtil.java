package com.book.util;

/**
 * 打印工具类
 * @Author: xjf
 * @Date: 2019/6/4 8:44
 */
public class PrintUtil {

    /**
     * 进入方法时的打印
     * @param methodName
     */
    public static void enterPrint(String methodName){
        System.out.println("threadName=[" + Thread.currentThread().getName() + "] enter into methodName=[" +
                methodName + "]. time=[" + TimeUtil.convertToString(System.currentTimeMillis()) + "]");

    }

    /**
     * 离开方法时的打印
     * @param methodName
     */
    public static void leavePrint(String methodName){
        System.out.println("threadName=[" + Thread.currentThread().getName() + "] leave methodName=[" +
                methodName + "]. time=[" + TimeUtil.convertToString(System.currentTimeMillis()) + "]");
    }
}
