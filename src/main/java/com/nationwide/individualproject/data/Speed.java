package com.nationwide.individualproject.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Speed {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long index;
    private float time;
    private String date;
    private String location;
    private String climber;

    public Speed(float T, String D, String L, String C){
        time = T;
        date = D;
        location = L;
        climber = C;
    }

    public Speed(){}

    public float getTime() {
        return time;
    }

    public void setTime(float time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getClimber() {
        return climber;
    }

    public void setClimber(String climber) {
        this.climber = climber;
    }
}
