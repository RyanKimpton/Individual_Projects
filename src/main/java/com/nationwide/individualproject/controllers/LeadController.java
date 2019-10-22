package com.nationwide.individualproject.controllers;

import com.nationwide.individualproject.Repos.LeadRepo;
import com.nationwide.individualproject.data.Lead;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
public class LeadController {
    private LeadRepo repo;

    @Autowired
    public LeadController(LeadRepo repo){
        this.repo = repo;
    }

    @PostMapping("/lead/add/{G}/{H}/{D}/{L}/{C}/{P}")
    public Lead LeadAdd(@PathVariable String G, @PathVariable int H, @PathVariable String D, @PathVariable String L, @PathVariable String C, @PathVariable String P){
        Lead ld = new Lead(G, H, D, L, C, P);
        repo.saveAndFlush(ld);
        return ld;
    }

    @GetMapping("/lead/showAll")
    public ArrayList<Lead> showAll(){
        return repo.findAll();
    }

    @GetMapping("/lead/findBy/grade/{G}")
    public ArrayList<Lead> findByGrade(@PathVariable String G){
        return repo.findByGrade(G);
    }

    @GetMapping("/lead/findBy/gradeGreaterThan/{G}")
    public ArrayList<Lead> findByGradeGreaterThan(@PathVariable String G){
        return repo.findByGradeGreaterThan(G);
    }

    @GetMapping("/lead/findBy/gradeGreaterThanEqual/{G}")
    public ArrayList<Lead> findByGradeGreaterThanEqual(@PathVariable String G){
        return repo.findByGradeGreaterThanEqual(G);
    }

    @GetMapping("/lead/findBy/gradeLessThan/{G}")
    public ArrayList<Lead> findByGradeLessThan(@PathVariable String G){
        return repo.findByGradeLessThan(G);
    }

    @GetMapping("/lead/findBy/gradeLessThanEqual/{G}")
    public ArrayList<Lead> findByGradeLessThanEqual(@PathVariable String G){
        return repo.findByGradeLessThanEqual(G);
    }

    @GetMapping("/lead/findBy/gradeBetween/{G1}/{G2}")
    public ArrayList<Lead> findByGradeBetween(@PathVariable String G1, @PathVariable String G2){
        return repo.findByGradeBetween(G1, G2);
    }

    @GetMapping("/lead/findBy/height/{H}")
    public ArrayList<Lead> findByHeight(@PathVariable int H){
        return repo.findByHeight(H);
    }

    @GetMapping("/lead/findBy/heightGreaterThan/{H}")
    public ArrayList<Lead> findByHeightGreaterThan(@PathVariable int H){
        return repo.findByHeightGreaterThan(H);
    }

    @GetMapping("/lead/findBy/heightGreaterThanEqual/{H}")
    public ArrayList<Lead> findByHeightGreaterThanEqual(@PathVariable int H){
        return repo.findByHeightGreaterThanEqual(H);
    }

    @GetMapping("/lead/findBy/heightLessThan/{H}")
    public ArrayList<Lead> findByHeightLessThan(@PathVariable int H){
        return repo.findByHeightLessThan(H);
    }

    @GetMapping("/lead/findBy/heightLessThanEqual/{H}")
    public ArrayList<Lead> findByHeightLessThanEqual(@PathVariable int H){
        return repo.findByHeightLessThanEqual(H);
    }

    @GetMapping("/lead/findBy/heightBetween/{H1}/{H2}")
    public ArrayList<Lead> findByHeightBetween(@PathVariable int H1, @PathVariable int H2){
        return repo.findByHeightBetween(H1, H2);
    }

    @GetMapping("/lead/findBy/date/{D}")
    public ArrayList<Lead> findByDate(@PathVariable String D){
        return repo.findByDate(D);
    }

    @GetMapping("/lead/findBy/location/{L}")
    public ArrayList<Lead> findByLoaction(@PathVariable String L){
        return repo.findByLocation(L);
    }

    @GetMapping("/lead/findBy/climber/{C}")
    public ArrayList<Lead> findByClimber(@PathVariable String C){
        return repo.findByClimber(C);
    }

    @GetMapping("/lead/findBy/partner/{P}")
    public ArrayList<Lead> findByPartner(@PathVariable String P){
        return repo.findByPartner(P);
    }

    @GetMapping("/lead/findBy/index/{I}")
    public Lead findByIndex(@PathVariable long I){
        return repo.findByIndex(I);
    }

    @PutMapping("/lead/update/date/{I}/{D}")
    public void updateLeadDate(@PathVariable long I, @PathVariable String D){
        Lead leadInDB = repo.findByIndex(I);
        leadInDB.setDate(D);
        repo.saveAndFlush(leadInDB);
    }

    @PutMapping("/lead/update/grade/{I}/{G}")
    public void updateLeadGrade(@PathVariable long I, @PathVariable String G){
        Lead leadInDB = repo.findByIndex(I);
        leadInDB.setGrade(G);
        repo.saveAndFlush(leadInDB);
    }

    @PutMapping("/lead/update/height/{I}/{H}")
    public void updateLeadHeight(@PathVariable long I, @PathVariable int H){
        Lead leadInDB = repo.findByIndex(I);
        leadInDB.setHeight(H);
        repo.saveAndFlush(leadInDB);
    }

    @PutMapping("/lead/update/location/{I}/{L}")
    public void updateLeadLocation(@PathVariable long I, @PathVariable String L){
        Lead leadInDB = repo.findByIndex(I);
        leadInDB.setLocation(L);
        repo.saveAndFlush(leadInDB);
    }

    @PutMapping("/lead/update/climber/{I}/{C}")
    public void updateLeadClimber(@PathVariable long I, @PathVariable String C){
        Lead leadInDB = repo.findByIndex(I);
        leadInDB.setClimber(C);
        repo.saveAndFlush(leadInDB);
    }

    @PutMapping("/lead/update/partner/{I}/{P}")
    public void updateLeadPartner(@PathVariable long I, @PathVariable String P){
        Lead leadInDB = repo.findByIndex(I);
        leadInDB.setPartner(P);
        repo.saveAndFlush(leadInDB);
    }




}
