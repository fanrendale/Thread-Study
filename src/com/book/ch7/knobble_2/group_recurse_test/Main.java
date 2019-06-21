package com.book.ch7.knobble_2.group_recurse_test;

/**
 * 使用递归和非递归获取线程组的下级线程组
 *
 * 递归会获取所有的下级，一直往下级递归，获取1级、2级、3级。。。
 * 非递归则只会获取当前线程组的直属下级线程组
 *
 * @Author: xjf
 * @Date: 2019/6/20 8:57
 */
public class Main {

    public static void main(String[] args) {
        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
        //在main线程组下添加线程组A
        ThreadGroup groupA = new ThreadGroup(mainGroup,"A");
        //在线程组A下添加线程组B
        ThreadGroup groupB = new ThreadGroup(groupA,"B");

        //创建线程组数组，大小为当前线程组的所有活跃线程组个数
        ThreadGroup[] groupList1 = new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];
        //将当前线程组的所有子线程组复制到数组中，为true则代表会一直向下获取所有子级，为false则只获取直属下级
        Thread.currentThread().getThreadGroup().enumerate(groupList1,true);
        for (ThreadGroup group : groupList1) {
            if (group != null){
                System.out.println("groupList1: " + group.getName());
            }
        }

        ThreadGroup[] groupList2 = new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];
        //非递归获取下级线程组
        Thread.currentThread().getThreadGroup().enumerate(groupList2, false);
        for (ThreadGroup group : groupList2) {
            if (group != null){
                System.out.println("groupList2: " + group.getName());
            }
        }
    }
}
