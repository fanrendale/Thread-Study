package com.book.ch2.knobble_2.dirty_read;

import java.util.ArrayList;
import java.util.List;

/**
 * 只能存放一个元素的List
 * @Author: xjf
 * @Date: 2019/6/3 16:47
 */
public class MyOneList {
    private List<String> list = new ArrayList<>();

    synchronized public void add(String data){
        list.add(data);
    }

    synchronized public int getSize(){
        return list.size();
    }
}
