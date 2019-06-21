package com.book.ch3.knobble_1.pipe_reader_writer;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

/**
 * 通过管道进行线程间通信：字符流
 *
 * @Author: xjf
 * @Date: 2019/6/10 9:38
 */
public class Main {

    public static void main(String[] args) {
        try {
            WriteData writeData = new WriteData();
            ReadData readData = new ReadData();

            PipedWriter writer = new PipedWriter();
            PipedReader reader = new PipedReader();

            //将管道连接
            writer.connect(reader);

            ReadThread readThread = new ReadThread(readData,reader);
            readThread.start();

            Thread.sleep(2000);

            WriteThread writeThread = new WriteThread(writeData,writer);
            writeThread.start();
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }
}
