package com.stackroute.config;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringBeanConfiguration {

//through autowirebyname
    @Bean(name="movie1")
    public Movie getMovie(){

        return new Movie("dhoom");


    }
    @Bean(name="actor")
    public Actor getActor(){
        return new Actor("hrithik",25,1);

    }

}