package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Movie {

    Actor actor;


    public Movie(Actor actor) {
        this.actor = actor;
    }
    public void print(){
        actor.print();
    }
}
