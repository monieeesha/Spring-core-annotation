package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie {
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

    public Movie(Actor actor, String mname) {
        this.actor = actor;
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
}