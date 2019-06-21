package com.book.ch3.knobble_1.pipe_input_output;

import java.io.PipedInputStream;

/**
 * @Author: xjf
 * @Date: 2019/6/9 23:39
 */
public class ReadThread extends Thread {

    private ReadData readData;
    private PipedInputStream input;

    public ReadThread(ReadData readData, PipedInputStream input) {
        this.readData = readData;
        this.input = input;
    }

    @Override
    public void run() {
        readData.readMethod(input);
    }
}
