package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;


//movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware
@Component
public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware
{

    @Autowired
    private Actor actor;

    private String mname;
    public String getMname() {
        return mname;
    }

    public void setMname(String mname)
    {
        this.mname = mname;
    }

    public Movie()
    {

    }


    public Actor getActor() {
        return actor;
    }


    public Movie(String mname) {
        this.mname = mname;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                ", mname='" + mname + '\'' +
                '}';
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println(beanFactory.getBean("movie1"));
    }

    @Override
    public void setBeanName(String s) {

        System.out.println(s);

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException
    {
        System.out.println(applicationContext.getBean("movie1"));
    }
}