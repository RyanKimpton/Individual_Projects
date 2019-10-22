package com.nationwide.individualproject.controllers;

import com.nationwide.individualproject.Repos.SpeedRepo;
import com.nationwide.individualproject.data.Speed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class SpeedController {
    private SpeedRepo repo;

    @Autowired
    public SpeedController(SpeedRepo repo){
        this.repo = repo;
    }

    @PostMapping("/speed/add/{T}/{D}/{L}/{C}")
    public Speed SpeedAdd(@PathVariable float T, @PathVariable String D, @PathVariable String L, @PathVariable String C){
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

    @GetMapping("/speed/findBy/index/{I}")
    public Speed findByIndex(@PathVariable long I){
        return repo.findByIndex(I);
    }

    @PutMapping("/speed/update/date/{I}/{D}")
    public void updateSpeedDate(@PathVariable long I, @PathVariable String D){
        Speed speedInDB = repo.findByIndex(I);
        speedInDB.setDate(D);
        repo.saveAndFlush(speedInDB);
    }

    @PutMapping("/speed/update/time/{I}/{T}")
    public void updateSpeedTime(@PathVariable long I, @PathVariable float T){
        Speed speedInDB = repo.findByIndex(I);
        speedInDB.setTime(T);
        repo.saveAndFlush(speedInDB);
    }

    @PutMapping("/speed/update/location/{I}/{L}")
    public void updateSpeedLocation(@PathVariable long I, @PathVariable String L){
        Speed speedInDB = repo.findByIndex(I);
        speedInDB.setLocation(L);
        repo.saveAndFlush(speedInDB);
    }

    @PutMapping("/speed/update/climber/{I}/{C}")
    public void updateSpeedClimber(@PathVariable long I, @PathVariable String C){
        Speed speedInDB = repo.findByIndex(I);
        speedInDB.setClimber(C);
        repo.saveAndFlush(speedInDB);
    }



}
