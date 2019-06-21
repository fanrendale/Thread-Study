package com.book.ch3.knobble_1.pipe_input_output;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * 使用管道进行线程间的通信：字节流
 *
 * 本例中：先运行读取数据，由于一开始还没有数据，线程将阻塞在 【int readLength = input.read(byteArray);】处，直到有数据读取
 *
 * @Author: xjf
 * @Date: 2019/6/9 23:40
 */
public class Main {

    public static void main(String[] args) {
        try {
            WriteData writeData = new WriteData();
            ReadData readData = new ReadData();

            PipedOutputStream outputStream = new PipedOutputStream();
            PipedInputStream inputStream = new PipedInputStream();

            //将管道输出流和输入流连接，这样才可以将数据进行输出和输入
            outputStream.connect(inputStream);

            //先运行读取数据的线程
            ReadThread readThread = new ReadThread(readData,inputStream);
            readThread.start();

            Thread.sleep(2000);

            //后运行写入数据的线程
            WriteThread writeThread = new WriteThread(writeData,outputStream);
            writeThread.start();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
