package com.book.ch2.knobble_1.dirty_read;

/**
 * 测试线程脏读的情况：虽然在赋值时进行了同步，但是在取值不是同步的情况下，会有意想不到的结果
 * 在读取值时，变量的值可能被其他线程修改了。
 * @Author: xjf
 * @Date: 2019/5/30 10:05
 */
public class Main {

    public static void main(String[] args) {
        try {
            PublicVar publicVar = new PublicVar();

            MyThread thread = new MyThread(publicVar);
            thread.setName("线程1");
            thread.start();

            //取值的结果受该睡眠时间长短的影响：
            //如果该睡眠时间大于publicVar对象的setValue执行时间，则取值正确，否则数据不正确
            Thread.sleep(200);
            publicVar.getValue();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
