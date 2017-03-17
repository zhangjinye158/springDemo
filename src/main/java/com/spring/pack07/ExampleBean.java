package com.spring.pack07;

/**
 * Created by zhangjinye on 2017/3/17.
 */
public class ExampleBean {

    //计算终极答案的年数
    private int years;

    //生命的答案，宇宙和一切
    private String ultimateAnswer;

    public ExampleBean(int years, String ultimateAnswer) {
        this.years = years;
        this.ultimateAnswer = ultimateAnswer;
    }

    public String result() {
        return "year:" + years + ",answer:" + ultimateAnswer;
    }
}

