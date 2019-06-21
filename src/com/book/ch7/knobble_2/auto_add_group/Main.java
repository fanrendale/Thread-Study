package com.book.ch7.knobble_2.auto_add_group;

/**
 * 线程组自动归属特性：自动归属就是自动归到当前线程组中。(隐形添加)
 *
 * activGroupCount()：取得当前线程组对象中的子线程组数量
 * enumerate()：作用是将线程组中的子线程组以复制的形式拷贝到ThreadGroup[]数组对象中
 *
 * @Author: xjf
 * @Date: 2019/6/19 14:02
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("A处线程：" + Thread.currentThread().getName() +
                " 所处线程组名为：" + Thread.currentThread().getThreadGroup().getName() +
                " 其中有线程组数量：" + Thread.currentThread().getThreadGroup().activeGroupCount());

        ThreadGroup threadGroup = new ThreadGroup("新的线程组");
        ThreadGroup threadGroup2 = new ThreadGroup("新的线程组2");

        System.out.println("B处线程：" + Thread.currentThread().getName() +
                " 所处线程组名为：" + Thread.currentThread().getThreadGroup().getName() +
                " 其中有线程组数量：" + Thread.currentThread().getThreadGroup().activeGroupCount());

        ThreadGroup[] groups = new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];
        Thread.currentThread().getThreadGroup().enumerate(groups);

        for (int i = 0; i < groups.length; i++) {
            System.out.println("第" + (i+1) + "个线程组名为：" + groups[i].getName());
        }
    }
}
