package com.book.ch3.knobble_1.wait_notify_insert_test;

/**
 * @Author: xjf
 * @Date: 2019/6/10 10:12
 */
public class BackupBThread extends Thread {

    private DBTools dbTools;

    public BackupBThread(DBTools dbTools) {
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        dbTools.backupB();
    }
}
