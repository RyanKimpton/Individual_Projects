package com.nationwide.individualproject.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Boulder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long index;
    private String grade;
    private String date;
    private String location;
    private String climber;

    public Boulder(String G, String D, String L, String C){
        grade = G;
        date = D;
        location = L;
        climber = C;
    }

    public Boulder(){}

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
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
