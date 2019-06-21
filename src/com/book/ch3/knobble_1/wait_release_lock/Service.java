package com.book.ch3.knobble_1.wait_release_lock;

/**
 * @Author: xjf
 * @Date: 2019/6/7 13:43
 */
public class Service {

    private Object lock = new Object();

    public void testMethod(){
        synchronized (lock){
            try {
                System.out.println("wait begin");
                //执行wait方法后会释放锁
                lock.wait();

                //如果将wait改成sleep，则会同步执行
//                Thread.sleep(3000);
                System.out.println("wait end");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
