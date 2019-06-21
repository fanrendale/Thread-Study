package com.book.ch6.knobble_4.singleton_serialize;

import java.io.*;

/**
 * 验证单例模式类序列化和反序列化时，不是同一个实例，破坏了单例
 *
 * 解决办法：在单例中加上readResolve方法，能解决
 *
 * @Author: xjf
 * @Date: 2019/6/18 8:34
 */
public class SaveAndRead {

    public static void main(String[] args) {
        try {
            MyObject myObject = MyObject.getInstance();

            FileOutputStream fosRef = new FileOutputStream(new File("myObjectFile.txt"));
            ObjectOutputStream oosRef = new ObjectOutputStream(fosRef);
            oosRef.writeObject(myObject);

            oosRef.close();
            fosRef.close();
            System.out.println("写入时：" + myObject.hashCode());
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fisRef = new FileInputStream(new File("myObjectFile.txt"));
            ObjectInputStream oisRef = new ObjectInputStream(fisRef);
            MyObject readObject = (MyObject)oisRef.readObject();
            oisRef.close();
            fisRef.close();


            System.out.println("读取时：" + readObject.hashCode());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
