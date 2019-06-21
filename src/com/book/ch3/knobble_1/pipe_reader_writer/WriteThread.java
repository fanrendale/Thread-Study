package com.book.ch3.knobble_1.pipe_reader_writer;

import java.io.PipedWriter;

/**
 * @Author: xjf
 * @Date: 2019/6/10 9:35
 */
public class WriteThread extends Thread {

    private WriteData writeData;
    private PipedWriter writer;

    public WriteThread(WriteData writeData, PipedWriter writer) {
        this.writeData = writeData;
        this.writer = writer;
    }

    @Override
    public void run() {
        writeData.write(writer);
    }
}
