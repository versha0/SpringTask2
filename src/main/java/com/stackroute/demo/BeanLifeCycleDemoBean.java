package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component
    public class BeanLifeCycleDemoBean implements InitializingBean, DisposableBean {
        String message;
        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
        @PostConstruct
        public void Init(){
            System.out.println("Inside custom Init");

        }
        @PreDestroy
        public void Destroy(){
            System.out.println("Inside customDestroy");
        }


        @Override
        public void afterPropertiesSet() throws Exception {
            System.out.println(message);
        }

        @Override
        public void destroy() throws Exception {
            System.out.println("Spring container is destroyed");

        }
    }

