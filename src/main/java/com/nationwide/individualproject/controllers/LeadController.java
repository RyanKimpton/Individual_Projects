package com.nationwide.individualproject.controllers;

import com.nationwide.individualproject.Repos.LeadRepo;
import com.nationwide.individualproject.data.Lead;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;


@RestController
public class LeadController {
    private LeadRepo repo;

    @Autowired
    public LeadController(LeadRepo repo){
        this.repo = repo;
    }

    @PostMapping("/lead/add/{G}/{H}/{D}/{L}/{C}/{P}")
    public Lead LeadAdd(@PathVariable String G, @PathVariable int H, @PathVariable Date D, @PathVariable String L, @PathVariable String C, @PathVariable String P){
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
    public ArrayList<Lead> findByDate(@PathVariable Date D){
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

}
