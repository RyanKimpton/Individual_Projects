package com.nationwide.individualproject.controllers;

import com.nationwide.individualproject.Repos.TopRopeRepo;
import com.nationwide.individualproject.data.TopRope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class TopRopeController {
    private TopRopeRepo repo;

    @Autowired
    public TopRopeController(TopRopeRepo repo){
        this.repo = repo;
    }

    @CrossOrigin
    @PostMapping("/topRope/add/{G}/{H}/{D}/{L}/{C}/{P}")
    public TopRope TopRopeAdd(@PathVariable String G, @PathVariable int H, @PathVariable String D, @PathVariable String L, @PathVariable String C, @PathVariable String P){
        TopRope tr = new TopRope(G, H, D, L, C, P);
        repo.saveAndFlush(tr);
        return tr;
    }

    @CrossOrigin
    @GetMapping("/topRope/showAll")
    public ArrayList<TopRope> showAll(){
        return repo.findAll();
    }

    @CrossOrigin
    @GetMapping("/topRope/findBy/grade/{G}")
    public ArrayList<TopRope> findByGrade(@PathVariable String G){
        return repo.findByGrade(G);
    }

    @CrossOrigin
    @GetMapping("/topRop/findBy/gradeGreaterThan/{G}")
    public ArrayList<TopRope> findByGradeGreaterThan(@PathVariable String G){
        return repo.findByGradeGreaterThan(G);
    }

    @CrossOrigin
    @GetMapping("/topRope/findBy/gradeGreaterThanEqual/{G}")
    public ArrayList<TopRope> findByGradeGreaterThanEqual(@PathVariable String G){
        return repo.findByGradeGreaterThanEqual(G);
    }

    @CrossOrigin
    @GetMapping("/topRope/findBy/gradeLessThan/{G}")
    public ArrayList<TopRope> findByGradeLessThan(@PathVariable String G){
        return repo.findByGradeLessThan(G);
    }

    @CrossOrigin
    @GetMapping("/topRope/findBy/gradeLessThanEqual/{G}")
    public ArrayList<TopRope> findByGradeLessThanEqual(@PathVariable String G){
        return repo.findByGradeLessThanEqual(G);
    }

    @CrossOrigin
    @GetMapping("/topRope/findBy/gradeBetween/{G1}/{G2}")
    public ArrayList<TopRope> findByGradeBetween(@PathVariable String G1, @PathVariable String G2){
        return repo.findByGradeBetween(G1, G2);
    }

    @CrossOrigin
    @GetMapping("topRope/findBy/height/{H}")
    public ArrayList<TopRope> findByHeight(@PathVariable int H){
        return repo.findByHeight(H);
    }

    @CrossOrigin
    @GetMapping("topRope/findBy/heightGreaterThan/{H}")
    public ArrayList<TopRope> findByHeightGreaterThan(@PathVariable int H){
        return repo.findByHeightGreaterThan(H);
    }

    @CrossOrigin
    @GetMapping("/topRope/findBy/heightGreaterThanEqual/{H}")
    public ArrayList<TopRope> findByHeightGreaterThanEqual(@PathVariable int H){
        return repo.findByHeightGreaterThanEqual(H);
    }

    @CrossOrigin
    @GetMapping("/topRope/findBy/heightLessThan/{H}")
    public ArrayList<TopRope> findByHeightLessThan(@PathVariable int H){
        return repo.findByHeightLessThan(H);
    }

    @CrossOrigin
    @GetMapping("/topRope/findBy/heightLessThanEqual/{H}")
    public ArrayList<TopRope> findByHeightLessThanEqual(@PathVariable int H){
        return repo.findByHeightLessThanEqual(H);
    }

    @CrossOrigin
    @GetMapping("/topRope/findBy/heightBetween/{H1}/{H2}")
    public ArrayList<TopRope> findByHeightBetween(@PathVariable int H1, @PathVariable int H2){
        return repo.findByHeightBetween(H1, H2);
    }

    @CrossOrigin
    @GetMapping("/topRope/findBy/date/{D}")
    public ArrayList<TopRope> findByDate(@PathVariable String D){
        return repo.findByDateNum(D);
    }

    @CrossOrigin
    @GetMapping("/topRope/findBy/location/{L}")
    public ArrayList<TopRope> findByLocation(@PathVariable String L){
        return repo.findByLocation(L);
    }

    @CrossOrigin
    @GetMapping("/topRope/findBy/climber/{C}")
    public ArrayList<TopRope> findByClimber(@PathVariable String C){
        return repo.findByClimber(C);
    }

    @CrossOrigin
    @GetMapping("/topRope/findBy/partner/{P}")
    public ArrayList<TopRope> findByPartner(@PathVariable String P){
        return repo.findByPartner(P);
    }

    @CrossOrigin
    @GetMapping("/topRope/findBy/index/{I}")
    public TopRope findByIndex(@PathVariable long I){
        return repo.findById(I);
    }

    @CrossOrigin
    @PutMapping("/topRope/update/date/{I}/{D}")
    public void updateTopRopeDate(@PathVariable long I, @PathVariable String D){
        TopRope topRopeInDB = repo.findById(I);
        topRopeInDB.setDateNum(D);
        repo.saveAndFlush(topRopeInDB);
    }

    @CrossOrigin
    @PutMapping("/topRope/update/grade/{I}/{G}")
    public void updateTopRopeGrade(@PathVariable long I, @PathVariable String G){
        TopRope topRopeInDB = repo.findById(I);
        topRopeInDB.setGrade(G);
        repo.saveAndFlush(topRopeInDB);
    }

    @CrossOrigin
    @PutMapping("/topRope/update/height/{I}/{H}")
    public void updateTopRopeHeight(@PathVariable long I, @PathVariable int H){
        TopRope topRopeInDB = repo.findById(I);
        topRopeInDB.setHeight(H);
        repo.saveAndFlush(topRopeInDB);
    }

    @CrossOrigin
    @PutMapping("/topRope/update/location/{I}/{L}")
    public void updateTopRopeLocation(@PathVariable long I, @PathVariable String L){
        TopRope topRopeInDB = repo.findById(I);
        topRopeInDB.setLocation(L);
        repo.saveAndFlush(topRopeInDB);
    }

    @CrossOrigin
    @PutMapping("/topRope/update/climber/{I}/{C}")
    public void updateTopRopeClimber(@PathVariable long I, @PathVariable String C){
        TopRope topRopeInDB = repo.findById(I);
        topRopeInDB.setClimber(C);
        repo.saveAndFlush(topRopeInDB);
    }

    @CrossOrigin
    @PutMapping("/topRope/update/partner/{I}/{P}")
    public void updateTopRopePartner(@PathVariable long I, @PathVariable String P){
        TopRope topRopeInDB = repo.findById(I);
        topRopeInDB.setPartner(P);
        repo.saveAndFlush(topRopeInDB);
    }

    @CrossOrigin
    @DeleteMapping("/topRope/delete/{I}")
    public void deleteTopRope(@PathVariable long I){
        repo.delete(repo.findById(I));
    }

}
