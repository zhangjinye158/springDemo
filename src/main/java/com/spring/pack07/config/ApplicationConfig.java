package com.spring.pack07.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zhangjinye on 2017/3/18.
 */
@Configuration
public class ApplicationConfig {

    @Bean
    public OrderService orderService(){
        return new OrderService();
    }
}
