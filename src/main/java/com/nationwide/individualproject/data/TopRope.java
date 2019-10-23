package com.nationwide.individualproject.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TopRope {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String grade;
    private int height;
    private String dateNum;
    private String location;
    private String climber;
    private String partner;

    public TopRope(String G, int H, String D, String L, String C, String P){
        grade = G;
        height = H;
        dateNum = D;
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

