package com.nationwide.individualproject.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class TopRope {
    @Id
    private int index;
    private String grade;
    private int height;
    private Date date;
    private String location;
    private String climber;
    private String partner;

    public TopRope(int I, String G, int H, Date D, String L, String C, String P){
        index = I;
        grade = G;
        height = H;
        date = D;
        location = L;
        climber = C;
        partner = P;
    }

    public TopRope(){}


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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner;
    }
}

