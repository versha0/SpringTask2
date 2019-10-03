package com.stackroute.domain;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Hello world!
 */
@Component
public class Movie implements ApplicationContextAware, BeanFactoryAware,BeanNameAware{
    @Autowired
    Actor actor;
    ApplicationContext context;
    BeanFactory beanFactory;
    String name;
    Movie moviecontext;
    public ApplicationContext getContext() {
        return context;
    }
    public BeanFactory getBeanFactory() {
        return beanFactory;
    }
    public String getBeanName() {
        return name;
    }
    @Override
    public void setApplicationContext(ApplicationContext context)
            throws BeansException {
        this.context=context;
        moviecontext= (Movie)context.getBean(Movie.class);
        moviecontext.print();
    }
    public Movie(Actor actor) {
        this.actor = actor;
    }
    //
//       public void setActor(Actor actor) {
//        this.actor = actor;
//    }
//    public Movie() {
//   }
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
        moviecontext= (Movie)beanFactory.getBean(Movie.class);
        moviecontext.print();
    }
    public void print() {
        actor.print();
    }
    @Override
    public void setBeanName(String name) {
        System.out.println(name);
    }
}