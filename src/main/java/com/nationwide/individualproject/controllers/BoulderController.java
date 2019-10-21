package com.nationwide.individualproject.controllers;

import com.nationwide.individualproject.Repos.BoulderRepo;
import com.nationwide.individualproject.data.Boulder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;

@RestController
public class BoulderController {
//    private BoulderRepo repo;
//
//    @Autowired
//    public BoulderController(BoulderRepo repo){
//        this.repo = repo;
//    }

    @Autowired
    private BoulderRepo repo;

    @PostMapping("/boulder/add/{G}/{D}/{L}/{C}")
    public Boulder boulderAdd(@PathVariable String G, @PathVariable Date D, @PathVariable String L, @PathVariable String C){
        Boulder bould = new Boulder(G, D, L, C);
        repo.saveAndFlush(bould);
        return bould;
    }

    @GetMapping("/boulder/showAll")
    public ArrayList<Boulder> showAll(){
        return repo.findAll();
    }

    @GetMapping("/boulder/findBy/grade/{G}")
    public ArrayList<Boulder> findByGrade(@PathVariable String G){
        return repo.findByGrade(G);
    }

    @GetMapping("/boulder/findBy/gradeGreaterThan/{G}")
    public ArrayList<Boulder> findByGradeGreaterThan(@PathVariable String G){
        return repo.findByGradeGreaterThan(G);
    }

    @GetMapping("/Boulder/findBy/gradeGreaterThanEqual/{G}")
    public ArrayList<Boulder> findByGradeGreaterThanEqual(@PathVariable String G){
        return repo.findByGradeGreaterThanEqual(G);
    }

    @GetMapping("/boulder/findBy/gradeLessThan/{G}")
    public ArrayList<Boulder> findByGradeLessThan(@PathVariable String G){
        return repo.findByGradeLessThan(G);
    }

    @GetMapping("/boulder/findBy/gradeLessThanEqual/{G}")
    public ArrayList<Boulder> findByGradeLessThanEqual(@PathVariable String G){
        return repo.findByGradeLessThanEqual(G);
    }

    @GetMapping("/boulder/findBy/gradeBetween/{G1}/{G2}")
    public ArrayList<Boulder> findByGradeBetween(@PathVariable String G1, @PathVariable String G2){
        return repo.findByGradeBetween(G1, G2);
    }

    @GetMapping("/boulder/findBy/location/{L}")
    public ArrayList<Boulder> findByLocation(@PathVariable String L){
        return repo.findByLocation(L);
    }

    @GetMapping("/boulder/findBy/Climber/{C}")
    public ArrayList<Boulder> findByClimber(@PathVariable String C){
        return repo.findByClimber(C);
    }

    @GetMapping("/boulder/findBy/Date/{D}")
    public ArrayList<Boulder> findByDate(@PathVariable Date D){
        return repo.findByDate(D);
    }

}
