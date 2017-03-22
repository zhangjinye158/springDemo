package com.spring.pack07.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * Created by zhangjinye on 2017/3/22.
 */
@Configuration
public class ServiceConfig {

    @Bean
    public Transervice transformService(){
        return new Transervice();
    }
}
