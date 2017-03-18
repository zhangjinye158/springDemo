package com.spring.pack07.dao;

import org.springframework.stereotype.Repository;

/**
 * Created by zhangjinye on 2017/3/18.
 */
@Repository
public class DAOImpl implements DAO {

    public String dao(){
        return "DAOImpl--->dao";
    }
}
