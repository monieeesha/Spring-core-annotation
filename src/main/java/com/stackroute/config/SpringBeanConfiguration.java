package com.stackroute.config;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeanConfiguration {

   /* @Bean(name="movie1")
    public Movie getMovie(){
        return new Movie("kabirsingh");
    }
    @Bean(name="actor")
    public Actor getActor()
    {
        return  new Actor("shahidh",21,1);
    }
    @Bean(name="movie1")
    public Movie getMovie1(){
        return new Movie("dhoom");
    }
    @Bean(name="actor")
    public Actor getActor1()
    {
        return  new Actor("hrithik",31,1);
    }*/

        @Bean(name="movie1")
        public Movie getMovie() {
            return new Movie("kabirsingh");
        }

        @Bean(name="actor")
        public Actor getActor()
          {
            Actor actor = new Actor();
            actor.setName("Mahesh");
            actor.setAge(35);
            actor.setAid(1);
            return actor;
        }

    }