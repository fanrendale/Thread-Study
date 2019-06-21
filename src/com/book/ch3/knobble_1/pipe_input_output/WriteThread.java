package com.book.ch3.knobble_1.pipe_input_output;

import java.io.PipedOutputStream;

/**
 * 输出流线程，写入数据
 *
 * @Author: xjf
 * @Date: 2019/6/9 23:38
 */
public class WriteThread extends Thread {

    private WriteData writeData;
    private PipedOutputStream out;

    public WriteThread(WriteData writeData, PipedOutputStream out) {
        this.writeData = writeData;
        this.out = out;
    }

    @Override
    public void run() {
        writeData.writeMethod(out);
    }
}
