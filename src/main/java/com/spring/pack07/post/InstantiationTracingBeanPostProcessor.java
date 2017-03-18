package com.spring.pack07.post;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * 后置bean
 * Created by zhangjinye on 2017/3/17.
 */
public class InstantiationTracingBeanPostProcessor implements BeanPostProcessor {

    // 如果你想在Spring容器完成实例化，配置和初始化bean之后实现一些自定义逻辑，
    // 可以插入一个或多个BeanPostProcessor实现。
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Bean '" + beanName + "' created : " + bean.toString());
        return bean;
    }
}
