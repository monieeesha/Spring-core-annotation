package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie {


    @Autowired
    private Actor actor;


    private String mname;

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public Movie()
    {

    }
    public Movie( String mname) {

        this.mname = mname;
    }

    public Actor getActor() {
        return actor;
    }

    @Autowired
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
}