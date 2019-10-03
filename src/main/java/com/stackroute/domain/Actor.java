package com.stackroute.domain;

import org.springframework.stereotype.Component;

@Component
public class Actor {
    String name;
    String gender;
    int age;



        public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    public void print(){
        System.out.println("Name:" +name+" Gender:"+ gender+" Age:"+age);
    }
}
