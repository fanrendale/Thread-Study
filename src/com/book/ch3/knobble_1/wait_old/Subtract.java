package com.book.ch3.knobble_1.wait_old;

/**
 * @Author: xjf
 * @Date: 2019/6/8 8:59
 */
public class Subtract {

    private String lock;

    public Subtract(String lock) {
        this.lock = lock;
    }

    public void subtract(){
        synchronized (lock){
            try {
                //避免数组下标越界修改,将if改为while，这样在一个方法成功获取通知并移除元素后，其他的wait状态的线程将会一直处于循环中
                /*if*/ while (ValueObject.list.size() == 0){
                    System.out.println("wait() begin. ThreadName=" + Thread.currentThread().getName());
                    lock.wait();
                    System.out.println("wait() end. ThreadName=" + Thread.currentThread().getName());
                }

                //进行减法(移除），多个线程移除时可能会索引越界异常
                ValueObject.list.remove(0);
                System.out.println("remove success. size=" + ValueObject.list.size());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
