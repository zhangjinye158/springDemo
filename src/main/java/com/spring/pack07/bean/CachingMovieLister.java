package com.spring.pack07.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by zhangjinye on 2017/3/18.
 */
@Component
public class CachingMovieLister {

    @PostConstruct
    public void post(){
        System.out.println("post--->");
    }

    @PreDestroy
    public void clear(){
        System.out.println("clear--->");
    }
}
