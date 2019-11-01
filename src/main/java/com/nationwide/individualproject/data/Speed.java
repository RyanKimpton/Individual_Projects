package com.nationwide.individualproject.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Speed {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String time;
    private String dateNum;
    private String location;
    private String climber;

    public Speed(String T, String D, String L, String C){
        time = T;
        dateNum = D;
        location = L;
        climber = C;
    }

    public Speed(){}

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDateNum() {
        return dateNum;
    }

    public void setDateNum(String dateNum) {
        this.dateNum = dateNum;
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

    public long getId() {
        return id;
    }
}
