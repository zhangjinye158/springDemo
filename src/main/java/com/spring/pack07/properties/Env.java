package com.spring.pack07.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * Created by zhangjinye on 2017/3/21.
 */
@Configuration
@PropertySource({"classpath:/jdbc.properties"})
public class Env {

		//»·¾³
    @Autowired
    private Environment environment;

    public String getEnv(String key) {
        return environment.getProperty(key);
    }

    public Environment getEnvironment() {
        return environment;
    }

    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
