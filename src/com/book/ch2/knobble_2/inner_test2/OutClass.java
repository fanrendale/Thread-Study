package com.book.ch2.knobble_2.inner_test2;

import com.book.util.PrintUtil;

/**
 * @Author: xjf
 * @Date: 2019/6/4 15:59
 */
public class OutClass {
    static class InnerClass1{
        public void method1(InnerClass2 class2){
            synchronized (class2){
                PrintUtil.enterPrint("InnerClass1==>method1");

                for (int i = 0; i < 10; i++) {
                    System.out.println("i=" + i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                PrintUtil.leavePrint("InnerClass1==>method1");
            }
        }

        synchronized public void method2(){
            PrintUtil.enterPrint("InnerClass1==>method2");

            for (int j = 0; j < 10; j++) {
                System.out.println("j=" + j);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            PrintUtil.leavePrint("InnerClass1==>method2");

        }
    }

    static class InnerClass2{
        synchronized public void method1(){
            PrintUtil.enterPrint("InnerClass2==>method1");
            for (int k = 0; k < 10; k++) {
                System.out.println("k="+k);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            PrintUtil.leavePrint("InnerClass2==>method1");
        }
    }
}
