package com.book.ch3.knobble_1.pipe_reader_writer;

import java.io.PipedReader;

/**
 * @Author: xjf
 * @Date: 2019/6/10 9:37
 */
public class ReadThread extends Thread {

    private ReadData readData;
    private PipedReader reader;

    public ReadThread(ReadData readData, PipedReader reader) {
        this.readData = readData;
        this.reader = reader;
    }

    @Override
    public void run() {
        readData.read(reader);
    }
}
