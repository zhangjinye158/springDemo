package com.config;

import com.spring.pack07.config.OrderService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by zhangjinye on 2017/3/18.
 */
public class TestConfig {

    @Test
    public void testConfig() {
        ApplicationContext annotationContext =
                new AnnotationConfigApplicationContext("ApplicationConfig");
        annotationContext.getBean(OrderService.class);

    }
}
