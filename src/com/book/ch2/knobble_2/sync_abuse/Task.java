package com.book.ch2.knobble_2.sync_abuse;

/**
 * @Author: xjf
 * @Date: 2019/5/31 9:33
 */
public class Task {

    private String dataStr1;
    private String dataStr2;

    public void doTask(){
        try {
            System.out.println("task begin");
            Thread.sleep(3000);

            String remoteStr1 = "假装长时间处理任务后从远程返回的值1========threadName=" + Thread.currentThread().getName();
            String remoteStr2 = "假装长时间处理任务后从远程返回的值2========threadName=" + Thread.currentThread().getName();

            //使用同步代码块,以此来提供同步的运行效率
            synchronized (this){
                //这儿睡眠可以判断是同步执行的,如果两个线程执行这儿，将会耗时4s（同步）
                Thread.sleep(2000);
                System.out.println("currentThread=" + Thread.currentThread().getName());
                dataStr1 = remoteStr1;
                dataStr2 = remoteStr2;
            }

            System.out.println(dataStr1);
            System.out.println(dataStr2);

            System.out.println("task end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
