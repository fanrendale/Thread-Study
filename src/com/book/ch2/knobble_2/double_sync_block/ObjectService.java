package com.book.ch2.knobble_2.double_sync_block;

/**
 * @Author: xjf
 * @Date: 2019/5/31 13:48
 */
public class ObjectService {

    public void serviceMethodA(){
        synchronized (this){
            try {
                System.out.println("serviceA is run. start=" + System.currentTimeMillis());
                Thread.sleep(3000);
                System.out.println("serviceA is run. end=" + System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void serviceMethodB(){
        synchronized (this){
            System.out.println("serviceB is run. start=" + System.currentTimeMillis());
            System.out.println("serviceB is run. end=" + System.currentTimeMillis());

        }
    }
}
