package com.nationwide.individualproject.controllers;

import com.nationwide.individualproject.Repos.TopRopeRepo;
import com.nationwide.individualproject.data.TopRope;
import org.hibernate.validator.constraints.pl.REGON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin("*")
public class TopRopeController {
    private TopRopeRepo repo;

    @Autowired
    public TopRopeController(TopRopeRepo repo){
        this.repo = repo;
    }

    
    @PostMapping("/topRope/add")
    public TopRope TopRopeAdd(@RequestBody TopRope tr){
        repo.saveAndFlush(tr);
        return tr;
    }

    
    @GetMapping("/topRope/showAll")
    public ArrayList<TopRope> showAll(){
        return repo.findAll();
    }

    @GetMapping("/topRope/sortBy/grade")
    public ArrayList<TopRope> orderByGrade(){
        return repo.findAllByOrderByGrade();
    }

    @GetMapping("/topRope/sortBy/height")
    public ArrayList<TopRope> orderByHeight(){
        return repo.findAllByOrderByHeight();
    }

    @GetMapping("/topRope/sortBy/date")
    public ArrayList<TopRope> orderByDate(){
        return repo.findAllByOrderByDateNum();
    }

    @GetMapping("/topRope/sortBy/location")
    public ArrayList<TopRope> orderByLocation(){
        return repo.findAllByOrderByLocation();
    }

    @GetMapping("/topRope/sortBy/climber")
    public ArrayList<TopRope> orderByClimber(){
        return repo.findAllByOrderByClimber();
    }

    @GetMapping("/topRope/sortBy/partner")
    public ArrayList<TopRope> orderByPartner(){
        return repo.findAllByOrderByPartner();
    }

    
    @GetMapping("/topRope/findBy/grade/{G}")
    public ArrayList<TopRope> findByGrade(@PathVariable String G){
        return repo.findByGrade(G);
    }

    
    @GetMapping("/topRop/findBy/gradeGreaterThan/{G}")
    public ArrayList<TopRope> findByGradeGreaterThan(@PathVariable String G){
        return repo.findByGradeGreaterThan(G);
    }

    
    @GetMapping("/topRope/findBy/gradeGreaterThanEqual/{G}")
    public ArrayList<TopRope> findByGradeGreaterThanEqual(@PathVariable String G){
        return repo.findByGradeGreaterThanEqual(G);
    }

    
    @GetMapping("/topRope/findBy/gradeLessThan/{G}")
    public ArrayList<TopRope> findByGradeLessThan(@PathVariable String G){
        return repo.findByGradeLessThan(G);
    }

    
    @GetMapping("/topRope/findBy/gradeLessThanEqual/{G}")
    public ArrayList<TopRope> findByGradeLessThanEqual(@PathVariable String G){
        return repo.findByGradeLessThanEqual(G);
    }

    
    @GetMapping("/topRope/findBy/gradeBetween/{G1}/{G2}")
    public ArrayList<TopRope> findByGradeBetween(@PathVariable String G1, @PathVariable String G2){
        return repo.findByGradeBetween(G1, G2);
    }

    
    @GetMapping("topRope/findBy/height/{H}")
    public ArrayList<TopRope> findByHeight(@PathVariable int H){
        return repo.findByHeight(H);
    }

    
    @GetMapping("topRope/findBy/heightGreaterThan/{H}")
    public ArrayList<TopRope> findByHeightGreaterThan(@PathVariable int H){
        return repo.findByHeightGreaterThan(H);
    }

    
    @GetMapping("/topRope/findBy/heightGreaterThanEqual/{H}")
    public ArrayList<TopRope> findByHeightGreaterThanEqual(@PathVariable int H){
        return repo.findByHeightGreaterThanEqual(H);
    }

    
    @GetMapping("/topRope/findBy/heightLessThan/{H}")
    public ArrayList<TopRope> findByHeightLessThan(@PathVariable int H){
        return repo.findByHeightLessThan(H);
    }

    
    @GetMapping("/topRope/findBy/heightLessThanEqual/{H}")
    public ArrayList<TopRope> findByHeightLessThanEqual(@PathVariable int H){
        return repo.findByHeightLessThanEqual(H);
    }

    
    @GetMapping("/topRope/findBy/heightBetween/{H1}/{H2}")
    public ArrayList<TopRope> findByHeightBetween(@PathVariable int H1, @PathVariable int H2){
        return repo.findByHeightBetween(H1, H2);
    }

    
    @GetMapping("/topRope/findBy/date/{D}")
    public ArrayList<TopRope> findByDate(@PathVariable String D){
        return repo.findByDateNum(D);
    }

    
    @GetMapping("/topRope/findBy/location/{L}")
    public ArrayList<TopRope> findByLocation(@PathVariable String L){
        return repo.findByLocation(L);
    }

    
    @GetMapping("/topRope/findBy/climber/{C}")
    public ArrayList<TopRope> findByClimber(@PathVariable String C){
        return repo.findByClimber(C);
    }

    
    @GetMapping("/topRope/findBy/partner/{P}")
    public ArrayList<TopRope> findByPartner(@PathVariable String P){
        return repo.findByPartner(P);
    }

    
    @GetMapping("/topRope/findBy/index/{I}")
    public TopRope findByIndex(@PathVariable long I){
        return repo.findById(I);
    }

    @PostMapping("/topRope/update")
    public TopRope updateTopRope(@RequestBody TopRope tr){
        repo.saveAndFlush(tr);
        return tr;
    }

    @DeleteMapping("/topRope/delete/{I}")
    public void deleteTopRope(@PathVariable long I){
        repo.delete(repo.findById(I));
    }

}
