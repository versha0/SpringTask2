package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Actor getactor(){
        return new Actor("irfan", "male",23);
    }
    @Bean
    public Movie getmovie(){
        return new Movie(getactor());
    }
}