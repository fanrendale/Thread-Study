package com.book.ch7.knobble_3.thread_run_sync;

/**
 * @Author: xjf
 * @Date: 2019/6/20 9:24
 */
public class MyThread extends Thread {

    private Object lock;
    //打印的字符
    private String showString;
    //字符显示的位置
    private int showPosition;
    //统计打印字符的个数
    private int printCount;
    //统计所有添加的元素个数
    private volatile static int addNumber = 1;

    public MyThread(Object lock, String showString, int showPosition) {
        this.lock = lock;
        this.showString = showString;
        this.showPosition = showPosition;
    }

    @Override
    public void run() {
        try {
            synchronized (lock){
                while (true){
                    if (addNumber % 3 == showPosition){
                        System.out.println("ThreadName=" + Thread.currentThread().getName() +
                                " runCount=" + addNumber + "  " + showString);
                        lock.notifyAll();
                        addNumber++;
                        printCount++;

                        //此处因为printCount不是线程间的对象，所以为线程自己的变量，则代表每个字符打印3遍后停止
                        if (printCount == 3){
                            break;
                        }
                    }else {
                        lock.wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
