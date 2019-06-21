package com.book.ch2.knobble_1.lock_reentry;

/**
 * synchronized拥有锁重入的功能
 *
 * 解释：在使用synchronized时，当一个线程得到对象锁后，再次请求此对象锁是可以再次得到该对象的锁的。
 *      这也说明在一个synchronized方法/块的内部调用本类的其他synchronized方法/块时，是永远可以得到锁的。
 * @Author: xjf
 * @Date: 2019/5/30 11:28
 */
public class Main {

    public static void main(String[] args) {
        MyService service = new MyService();

        MyThread thread = new MyThread(service);
        thread.start();
    }
}
