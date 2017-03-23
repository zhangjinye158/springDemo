package com.test;

import com.spring.pack07.*;
import com.spring.pack07.properties.Env;
import com.spring.pack07.service.Service;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.test.context.ContextConfiguration;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

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

        DI di = context.getBean(DI.class);
        di.testDI();
    }

    @Test
    public void testBean() {
        ExampleBean di = context.getBean(ExampleBean.class);
        System.out.println(di.result());
    }

    @Test
    public void testList() {
        ListBean di = context.getBean(ListBean.class);
        System.out.println(di.toList());
        System.out.println(di.toSet());
        System.out.println(di.toMap());
    }

    @Test
    public void testService() {
        Service service = context.getBean(Service.class);
        System.out.println(service.service());
    }


    //读取属性文件
    @Test
    public void testProperty() {
        Env service = context.getBean(Env.class);
        System.out.println(service.getEnv("jdbc.url"));
    }

    //读取本地文件
    @Test
    public void testSource() throws IOException {
        Resource resource = context.getResource("file:///Users/zhangjinye/Downloads/2.txt");
        //File file=resource.getFile();
        byte[] bytes = Files.readAllBytes(Paths.get(resource.getURI()));
        System.out.println(new String(bytes));
    }
}
