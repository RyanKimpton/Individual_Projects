package com.nationwide.individualproject.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Speed {
    @Id
    private float time;
    private Date date;
    private String location;
    private String climber;

    public Speed(float T, Date D, String L, String C){
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
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
