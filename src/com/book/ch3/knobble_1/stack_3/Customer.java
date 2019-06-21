package com.book.ch3.knobble_1.stack_3;

/**
 * @Author: xjf
 * @Date: 2019/6/9 16:58
 */
public class Customer {

    private MyStack myStack;

    public Customer(MyStack myStack) {
        this.myStack = myStack;
    }

    public void popService(){
        System.out.println("execute pop. value=" + myStack.pop());
    }
}
