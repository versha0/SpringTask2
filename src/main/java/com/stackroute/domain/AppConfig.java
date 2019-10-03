package com.stackroute.domain;
import com.stackroute.*;

import com.stackroute.demo.BeanLifeCycleDemoBean;
import com.stackroute.demo.BeanPostProcessorDemoBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.stackroute.domain")

public class AppConfig {
    @Bean
    public BeanLifeCycleDemoBean getBeanLifeCycleDemoBean(){
        return new BeanLifeCycleDemoBean();
    }
    @Bean
    public BeanPostProcessorDemoBean getBeanPostProcessorDemoBean(){
        return new BeanPostProcessorDemoBean();
    }

    }

