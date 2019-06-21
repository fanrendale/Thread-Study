package com.book.ch1.suspend_resume_no_same_value;

/**
 * suspend和resume方法的第二个缺点：不同步
 * @Author: xjf
 * @Date: 2019/5/27 12:42
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        final MyObject object = new MyObject();
        Thread thread1 = new Thread(){
            @Override
            public void run() {
                object.setValue("b","BB");
            }
        };
        thread1.setName("线程b");
        thread1.start();
        Thread.sleep(1000);

        Thread thread2 = new Thread(){
            @Override
            public void run() {
                object.printValue();
            }
        };
        thread2.start();

        System.out.println("main end!");


    }
}
