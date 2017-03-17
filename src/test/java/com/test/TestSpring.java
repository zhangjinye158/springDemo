package com.test;

import com.spring.pack07.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhangjinye on 2017/3/17.
 */
public class TestSpring {

    //获取springcontext上下文
    static ApplicationContext context =
            new ClassPathXmlApplicationContext(new String[]
                    {"applicationContext.xml"});

    @Test
    public void testSpring() {
        SpringDemo springDemo = context.getBean(SpringDemo.class);
        System.out.println(springDemo.string());

        ClientService service = context.getBean(ClientService.class);
        service.sysClientService();

        DI di=context.getBean(DI.class);
        di.testDI();
    }

    @Test
    public void testBean() {
        ExampleBean di=context.getBean(ExampleBean.class);
        System.out.println(di.result());
    }

    @Test
    public void testList() {
        ListBean di=context.getBean(ListBean.class);
        System.out.println(di.toList());
        System.out.println(di.toSet());
        System.out.println(di.toMap());
    }
}
