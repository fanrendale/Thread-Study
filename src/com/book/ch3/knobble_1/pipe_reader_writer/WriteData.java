package com.book.ch3.knobble_1.pipe_reader_writer;

import java.io.IOException;
import java.io.PipedWriter;

/**
 * @Author: xjf
 * @Date: 2019/6/10 9:03
 */
public class WriteData {

    public void write(PipedWriter writer){
        try {
            System.out.println("Write data:");
            for (int i = 0; i < 300; i++) {
                String data = "" + (i+1);
                writer.write(data);
                System.out.print(data);
            }

            System.out.println();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
