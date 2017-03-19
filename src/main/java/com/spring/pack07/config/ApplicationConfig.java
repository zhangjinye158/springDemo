package com.spring.pack07.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by zhangjinye on 2017/3/18.
 */
@Configuration
public class ApplicationConfig {

    @Bean(initMethod = "init",destroyMethod = "destr")
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public OrderService orderService() {
        return new OrderService();
    }

}
