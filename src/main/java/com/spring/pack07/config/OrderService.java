package com.spring.pack07.config;


/**
 * Created by zhangjinye on 2017/3/18.
 */
public class OrderService {

    public void doOrderService(String order){
        System.out.println("OrderService---:"+order);
    }

    //初始化
    public void init(){
        System.out.println("ApplicationConfig-init");
    }

    public void destr(){
        System.out.println("ApplicationConfig-destr");
    }
}
