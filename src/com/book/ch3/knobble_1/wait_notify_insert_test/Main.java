package com.book.ch3.knobble_1.wait_notify_insert_test;

/**
 * 实战：wait/notifyAll交叉备份
 *
 * 备份A和备份B交替进行
 *
 * @Author: xjf
 * @Date: 2019/6/10 10:13
 */
public class Main {

    public static void main(String[] args) {
        DBTools dbTools = new DBTools();

        for (int i = 0; i < 5; i++) {
            BackupBThread bThread = new BackupBThread(dbTools);
            bThread.start();
            BackupAThread aThread = new BackupAThread(dbTools);
            aThread.start();
        }
    }
}
