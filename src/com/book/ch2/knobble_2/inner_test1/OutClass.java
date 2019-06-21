package com.book.ch2.knobble_2.inner_test1;

/**
 * @Author: xjf
 * @Date: 2019/6/4 15:59
 */
public class OutClass {
    static class Inner{
        public void method1(){
            synchronized ("其他的锁"){
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "   i=" + i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        synchronized public void method2(){
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "   i=" + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
