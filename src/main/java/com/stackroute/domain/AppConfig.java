package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration

public class AppConfig {
    @Bean
    @Scope("prototype")
    public Actor getactor() {
        return new Actor("irfan", "male", 23);
    }

    @Bean
    @Scope("prototype")
    public Movie getmovie() {
        return new Movie(getactor());
    }
}
