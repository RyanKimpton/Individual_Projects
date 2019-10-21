package com.nationwide.individualproject.controllers;

import com.nationwide.individualproject.Repos.SpeedRepo;
import com.nationwide.individualproject.data.Speed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;

@RestController
public class SpeedController {
    private SpeedRepo repo;

    @Autowired
    public SpeedController(SpeedRepo repo){
        this.repo = repo;
    }

    @PostMapping("/speed/add/{T}/{D}/{L}/{C}")
    public Speed SpeedAdd(@PathVariable float T, @PathVariable Date D, @PathVariable String L, @PathVariable String C){
        Speed sp = new Speed(T, D, L, C);
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

    @GetMapping("/speed/findBy/Loaction/{L}")
    public ArrayList<Speed> findByLoaction(@PathVariable String L){
        return repo.findByLocation(L);
    }

    @GetMapping("/speed/findBy/climber/{C}")
    public ArrayList<Speed> findByClimber(@PathVariable String C){
        return repo.findByClimber(C);
    }


}
