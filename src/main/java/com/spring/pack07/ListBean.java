package com.spring.pack07;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by zhangjinye on 2017/3/17.
 */
public class ListBean {

    //注入集合
    private List<String> list;

    private Set<String> set;
    private Map<String, String> map;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public String toList() {
        return list.toString();
    }


    public String toSet() {
        return set.toString();
    }

    public String toMap() {
        return map.toString();
    }

    //初始化
    public void init(){
        System.out.println("----ListBean---");
    }
}
