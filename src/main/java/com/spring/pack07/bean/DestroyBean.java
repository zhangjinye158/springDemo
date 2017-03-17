package com.spring.pack07.bean;

import org.springframework.beans.factory.DisposableBean;

/**
 * 销毁bean
 * Created by zhangjinye on 2017/3/17.
 */
public class DestroyBean implements DisposableBean {
    public void destroy() throws Exception {
        System.out.println("DestroyBean---");
    }
}
