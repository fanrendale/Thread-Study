package com.book.ch3.knobble_1.pipe_input_output;

import java.io.IOException;
import java.io.PipedInputStream;

/**
 * 读取数据
 *
 * @Author: xjf
 * @Date: 2019/6/9 23:23
 */
public class ReadData {

    public void readMethod(PipedInputStream input){
        try {
            System.out.println("Read data:");
            byte[] byteArray = new byte[20];

            System.out.println("读取数据开始阻塞");
            //此处是读取输入流的内容，如果还没有可获取的输入流，则会阻塞在这儿，直到获取到数据
            int readLength = input.read(byteArray);


            System.out.println("读取数据结束阻塞");
            while (readLength != -1){
                String data = new String(byteArray,0,readLength);
                System.out.print(data);
                readLength = input.read(byteArray);
            }

            System.out.println();
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
