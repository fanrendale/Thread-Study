package com.book.ch3.knobble_1.pipe_input_output;

import java.io.IOException;
import java.io.PipedOutputStream;

/**
 * 将数据写入管道类，流输出，对于对象来说是将数据进行了输出
 *
 * @Author: xjf
 * @Date: 2019/6/9 23:20
 */
public class WriteData {

    public void writeMethod(PipedOutputStream out){
        try {
            System.out.println("Write data:");
            for (int i = 0; i < 300; i++) {
                String data = "" + (i+1);
                out.write(data.getBytes());
                System.out.print(data);
            }
            System.out.println();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
