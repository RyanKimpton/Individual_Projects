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

    @CrossOrigin
    @PostMapping("/speed/add/{T}/{D}/{L}/{C}")
    public Speed SpeedAdd(@PathVariable float T, @PathVariable String D, @PathVariable String L, @PathVariable String C){
        Speed sp = new Speed(T, D, L, C);
        repo.saveAndFlush(sp);
        return sp;
    }

    @CrossOrigin
    @GetMapping("/speed/showAll")
    public ArrayList<Speed> showAll(){
        return repo.findAll();
    }

    @CrossOrigin
    @GetMapping("/speed/findBy/time/{T}")
    public ArrayList<Speed> findByTime(@PathVariable float T){
        return repo.findByTime(T);
    }

    @CrossOrigin
    @GetMapping("/speed/findBy/timeGreaterThan/{T}")
    public ArrayList<Speed> findByTimeGreaterThan(@PathVariable float T){
        return repo.findByTimeGreaterThan(T);
    }

    @CrossOrigin
    @GetMapping("/speed/findBy/timeGreaterThanEqual/{T}")
    public ArrayList<Speed> findByTimeGreaterThanEqual(@PathVariable float T){
        return repo.findByTimeGreaterThanEqual(T);
    }

    @CrossOrigin
    @GetMapping("/speed/findBy/timeLessThan/{T}")
    public ArrayList<Speed> findByTimeLessThan(@PathVariable float T) {
        return repo.findByTimeLessThan(T);
    }

    @CrossOrigin
    @GetMapping("/speed/findBy/timeLessThanEqual/{T}")
    public ArrayList<Speed> findByTimeLessThanEqual(@PathVariable float T){
        return repo.findByTimeLessThanEqual(T);
    }

    @CrossOrigin
    @GetMapping("/speed/findBy/timeBetween/{T1}/{T2}")
    public ArrayList<Speed> findByTimeBetween(@PathVariable float T1, @PathVariable float T2){
        return repo.findByTimeBetween(T1, T2);
    }

    @CrossOrigin
    @GetMapping("/speed/findBy/date/{D}")
    public ArrayList<Speed> findByDateNum(@PathVariable String D){
        return repo.findByDateNum(D);
    }

    @CrossOrigin
    @GetMapping("/speed/findBy/Loaction/{L}")
    public ArrayList<Speed> findByLoaction(@PathVariable String L){
        return repo.findByLocation(L);
    }

    @CrossOrigin
    @GetMapping("/speed/findBy/climber/{C}")
    public ArrayList<Speed> findByClimber(@PathVariable String C){
        return repo.findByClimber(C);
    }

    @CrossOrigin
    @GetMapping("/speed/findBy/index/{I}")
    public Speed findByIndex(@PathVariable long I){
        return repo.findById(I);
    }

    @CrossOrigin
    @PutMapping("/speed/update/date/{I}/{D}")
    public void updateSpeedDate(@PathVariable long I, @PathVariable String D){
        Speed speedInDB = repo.findById(I);
        speedInDB.setDateNum(D);
        repo.saveAndFlush(speedInDB);
    }

    @CrossOrigin
    @PutMapping("/speed/update/time/{I}/{T}")
    public void updateSpeedTime(@PathVariable long I, @PathVariable float T){
        Speed speedInDB = repo.findById(I);
        speedInDB.setTime(T);
        repo.saveAndFlush(speedInDB);
    }

    @CrossOrigin
    @PutMapping("/speed/update/location/{I}/{L}")
    public void updateSpeedLocation(@PathVariable long I, @PathVariable String L){
        Speed speedInDB = repo.findById(I);
        speedInDB.setLocation(L);
        repo.saveAndFlush(speedInDB);
    }

    @CrossOrigin
    @PutMapping("/speed/update/climber/{I}/{C}")
    public void updateSpeedClimber(@PathVariable long I, @PathVariable String C){
        Speed speedInDB = repo.findById(I);
        speedInDB.setClimber(C);
        repo.saveAndFlush(speedInDB);
    }

    @CrossOrigin
    @DeleteMapping("/speed/delete/{I}")
    public void deleteSpeed(@PathVariable long I){
        repo.delete(repo.findById(I));
    }



}
