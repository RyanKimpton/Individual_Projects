package com.nationwide.individualproject.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Boulder {
    @Id
    private String grade;
    private Date date;
    private String location;
    private String climber;

    public Boulder(String G, Date D, String L, String C){
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
