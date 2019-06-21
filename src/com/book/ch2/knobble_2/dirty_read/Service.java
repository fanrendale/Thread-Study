package com.book.ch2.knobble_2.dirty_read;

/**
 * @Author: xjf
 * @Date: 2019/6/3 16:49
 */
public class Service {

    public MyOneList addServiceMethod(MyOneList list, String data){
        try {
            //添加同步方法块，这样在调用获取size时是同步的，避免异步获取size
            //将list对象设置为“对象监视器”，该list是传入的，在main方法中传的是同一个lis对象，因此能使该同步块同步必行
            synchronized (list) {
                //此处的判断应该是让list中的size不大于1，如果不加同步块：由于多个线程调用时是异步取size，会导致该判断失效
                if (list.getSize() < 1) {
                    //模拟从远程花费2秒取回数据
                    Thread.sleep(2000);
                    list.add(data);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return list;
    }
}
