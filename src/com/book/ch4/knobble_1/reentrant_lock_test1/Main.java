package com.book.ch4.knobble_1.reentrant_lock_test1;

/**
 * 继续测试ReentrantLock锁的同步性
 *
 * 由此例可得出：调用lock.lock()代码的线程就持有了“对象监视器”，其他线程只有等待锁被释放时再次争抢
 * 效果和使用synchronized关键字一样，线程之间还是顺序执行的。
 *
 * @author xjf
 * @date 2019/6/12 11:00
 */
public class Main {

    public static void main(String[] args) {
        try {
            MyService service = new MyService();

            ThreadA threadA = new ThreadA(service);
            ThreadAA threadAA = new ThreadAA(service);

            threadA.setName("threadA");
            threadAA.setName("threadAA");

            threadA.start();
            threadAA.start();

            Thread.sleep(1000);

            ThreadB threadB = new ThreadB(service);
            ThreadBB threadBB = new ThreadBB(service);

            threadB.setName("threadB");
            threadBB.setName("threadBB");

            threadB.start();
            threadBB.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
