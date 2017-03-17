package com.spring.pack07.bean;

import org.springframework.beans.factory.InitializingBean;

/**
 * 初始化bean
 * Created by zhangjinye on 2017/3/17.
 */
public class InitBean implements InitializingBean {
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitBean---->");
    }
}
