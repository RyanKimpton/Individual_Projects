package com.nationwide.individualproject.controllers;

import com.nationwide.individualproject.Repos.SpeedRepo;
import com.nationwide.individualproject.data.Speed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin("*")
public class SpeedController {
    private SpeedRepo repo;

    @Autowired
    public SpeedController(SpeedRepo repo){
        this.repo = repo;
    }

    
    @PostMapping("/speed/add")
    public Speed SpeedAdd(@RequestBody Speed sp){
        repo.saveAndFlush(sp);
        return sp;
    }

    
    @GetMapping("/speed/showAll")
    public ArrayList<Speed> showAll(){
        return repo.findAll();
    }

    
    @GetMapping("/speed/findBy/time/{T}")
    public ArrayList<Speed> findByTime(@PathVariable float T){
        return repo.findByTime(T);
    }

    
    @GetMapping("/speed/findBy/timeGreaterThan/{T}")
    public ArrayList<Speed> findByTimeGreaterThan(@PathVariable float T){
        return repo.findByTimeGreaterThan(T);
    }

    
    @GetMapping("/speed/findBy/timeGreaterThanEqual/{T}")
    public ArrayList<Speed> findByTimeGreaterThanEqual(@PathVariable float T){
        return repo.findByTimeGreaterThanEqual(T);
    }

    
    @GetMapping("/speed/findBy/timeLessThan/{T}")
    public ArrayList<Speed> findByTimeLessThan(@PathVariable float T) {
        return repo.findByTimeLessThan(T);
    }

    
    @GetMapping("/speed/findBy/timeLessThanEqual/{T}")
    public ArrayList<Speed> findByTimeLessThanEqual(@PathVariable float T){
        return repo.findByTimeLessThanEqual(T);
    }

    
    @GetMapping("/speed/findBy/timeBetween/{T1}/{T2}")
    public ArrayList<Speed> findByTimeBetween(@PathVariable float T1, @PathVariable float T2){
        return repo.findByTimeBetween(T1, T2);
    }

    
    @GetMapping("/speed/findBy/date/{D}")
    public ArrayList<Speed> findByDateNum(@PathVariable String D){
        return repo.findByDateNum(D);
    }

    
    @GetMapping("/speed/findBy/Loaction/{L}")
    public ArrayList<Speed> findByLoaction(@PathVariable String L){
        return repo.findByLocation(L);
    }

    
    @GetMapping("/speed/findBy/climber/{C}")
    public ArrayList<Speed> findByClimber(@PathVariable String C){
        return repo.findByClimber(C);
    }

    
    @GetMapping("/speed/findBy/index/{I}")
    public Speed findByIndex(@PathVariable long I){
        return repo.findById(I);
    }

    @PostMapping("/speed/update")
    public Speed updateSpeed(@RequestBody Speed sp){
        repo.saveAndFlush(sp);
        return sp;
    }
    
    
    @DeleteMapping("/speed/delete/{I}")
    public void deleteSpeed(@PathVariable long I){
        repo.delete(repo.findById(I));
    }



}
