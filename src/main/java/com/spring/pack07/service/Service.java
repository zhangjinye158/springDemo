package com.spring.pack07.service;

import com.spring.pack07.dao.DAO;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zhangjinye on 2017/3/18.
 */
@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private DAO dao;

    public String service(){
        return "service:"+dao.dao();
    }
}
