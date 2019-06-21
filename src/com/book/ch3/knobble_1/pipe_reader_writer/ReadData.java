package com.book.ch3.knobble_1.pipe_reader_writer;

import java.io.IOException;
import java.io.PipedReader;

/**
 * @Author: xjf
 * @Date: 2019/6/10 9:13
 */
public class ReadData  {

    public void read(PipedReader reader){
        try {
            System.out.println("Read data:");
            char[] byteArray = new char[20];
            int readLength = reader.read(byteArray);

            while (readLength != -1){
                String data = new String(byteArray,0,readLength);
                System.out.print(data);
                readLength = reader.read(byteArray);
            }

            System.out.println();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
