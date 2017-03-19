package com.config;

import com.spring.pack07.config.ApplicationConfig;
import com.spring.pack07.config.OrderService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.env.Environment;

/**
 * Created by zhangjinye on 2017/3/18.
 */
public class TestConfig {

    @Test
    public void testConfig() {
        //读取注解配置
        ApplicationContext annotationContext =
                new AnnotationConfigApplicationContext(ApplicationConfig.class);
        OrderService service = annotationContext.getBean(OrderService.class);
        service.doOrderService("hello world");
        boolean b = annotationContext.isPrototype("orderService");
        System.out.println(b);
    }

    @Test
    public void testEnv() {
        //读取注解配置
        ApplicationContext ctx =
                new GenericApplicationContext();
        Environment environment = ctx.getEnvironment();
        String[] strings = environment.getActiveProfiles();
        for (String s:strings){
            System.out.println(s);
        }
        System.out.println(strings.toString());
    }
}
