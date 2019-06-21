package com.book.ch2.knobble_2.sync_block_string2;

/**
 * @Author: xjf
 * @Date: 2019/6/3 9:55
 */
public class Service {
    private String anyString = new String();

    public void a(){
        try {
            //此处的对象监视器是anyString
            synchronized (anyString){
                System.out.println("a method begin");

                Thread.sleep(3000);

                System.out.println("a method end");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 该同步方法的对象监视器是this对象
     */
    synchronized public void b(){
        System.out.println("b method begin");
        System.out.println("b method end");
    }
}
