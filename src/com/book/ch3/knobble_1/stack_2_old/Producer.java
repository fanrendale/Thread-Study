package com.book.ch3.knobble_1.stack_2_old;

/**
 * @Author: xjf
 * @Date: 2019/6/9 16:58
 */
public class Producer {

    private MyStack myStack;

    public Producer(MyStack myStack) {
        this.myStack = myStack;
    }

    public void pushService(){
        myStack.push();
    }
}
