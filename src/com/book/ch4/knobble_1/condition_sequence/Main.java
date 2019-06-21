package com.book.ch4.knobble_1.condition_sequence;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 使用condition实现线程的顺序执行
 *
 * @Author: xjf
 * @Date: 2019/6/13 17:44
 */
public class Main {

    private static ReentrantLock lock = new ReentrantLock();
    final private static Condition conditonA = lock.newCondition();
    final private static Condition conditonB = lock.newCondition();
    final private static Condition conditonC = lock.newCondition();

    public static void main(String[] args) {
        Thread threadA = new Thread(){
            @Override
            public void run() {
                try {
                    lock.lock();
                    while (PublicValue.nextPrintValue != 1){
//                        System.out.println("锁住A");
                        conditonA.await();
                    }

                    for (int i = 0; i < 3; i++) {
                        System.out.println("PrintA value=" + (i+1));
                    }
                    PublicValue.nextPrintValue = 2;
                    conditonB.signalAll();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    if (lock.isHeldByCurrentThread()){
                        lock.unlock();
                    }
                }
            }
        };

        Thread threadB = new Thread(){
            @Override
            public void run() {
                try {
                    lock.lock();
                    while (PublicValue.nextPrintValue != 2){
                        conditonB.await();
                    }

                    for (int i = 0; i < 3; i++) {
                        System.out.println("PrintB value=" + (i+1));
                    }
                    PublicValue.nextPrintValue = 3;
                    conditonC.signalAll();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    if (lock.isHeldByCurrentThread()){
                        lock.unlock();
                    }
                }
            }
        };

        Thread threadC = new Thread(){
            @Override
            public void run() {
                try {
                    lock.lock();
                    while (PublicValue.nextPrintValue != 3){
                        conditonC.await();
                    }

                    for (int i = 0; i < 3; i++) {
                        System.out.println("PrintC value=" + (i+1));
                    }
                    PublicValue.nextPrintValue = 1;
                    conditonA.signalAll();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    if (lock.isHeldByCurrentThread()){
                        lock.unlock();
                    }
                }
            }
        };

        Thread[] aArray = new Thread[5];
        Thread[] bArray = new Thread[5];
        Thread[] cArray = new Thread[5];

        for (int i = 0; i < 5; i++) {
            aArray[i] = new Thread(threadA);
            bArray[i] = new Thread(threadB);
            cArray[i] = new Thread(threadC);

            aArray[i].start();
            bArray[i].start();
            cArray[i].start();
        }

    }
}
