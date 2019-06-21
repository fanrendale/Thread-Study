package com.book.ch3.knobble_1.two_thread_trans_data;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xjf
 * @Date: 2019/6/7 8:50
 */
public class MyList {

    /**
     * 必须添加volatile修饰符，不然在线程中会一直取私有堆栈的值，公共堆栈的值改变后取不到
     */
    volatile private List<String> list = new ArrayList<>();

    public void addElement(){
        list.add("咖啡");

    }

    public int getSize(){
//        System.out.println(list.size());
        return list.size();
    }
}
