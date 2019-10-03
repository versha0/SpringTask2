package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration

public class AppConfig {
    @Bean

    public Actor getactor() {


        return new  Actor();

    }

    @Bean

    public Movie getmovie() {

        return new Movie();
    }
}
