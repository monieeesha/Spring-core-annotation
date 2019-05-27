package com.stackroute.config;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringBeanConfiguration {

//through constructor
    @Bean(name="movie1")
    public Movie getMovie(){

        Actor actor=new Actor("hrithik",31,1);
        Movie movie=new Movie(actor,"dhoom");
        return movie;

    }
    @Bean(name="movie2")
    public Movie getMovie1(){

        Actor actor=new Actor("Sharukh",35,2);
        Movie movie=new Movie(actor,"kkk");
        return movie;

    }
    @Bean(name="movie3")
    public Movie getMovie2(){

        Actor actor=new Actor("ranbir",36,3);
        Movie movie=new Movie(actor,"ramleel");
        return movie;

    }


}