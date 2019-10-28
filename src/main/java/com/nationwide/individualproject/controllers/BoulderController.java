package com.nationwide.individualproject.controllers;

import com.nationwide.individualproject.Repos.BoulderRepo;
import com.nationwide.individualproject.data.Boulder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
public class BoulderController {
    private BoulderRepo repo;

    @Autowired
    public BoulderController(BoulderRepo repo){
        this.repo = repo;
    }

    @CrossOrigin
    @PostMapping("/boulder/add")
    public Boulder boulderAdd2(@RequestBody Boulder bould){
        repo.saveAndFlush(bould);
        return bould;
    }

    @CrossOrigin
    @GetMapping("/boulder/showAll")
    public ArrayList<Boulder> showAll(){
        return repo.findAll();
    }

    @CrossOrigin
    @GetMapping("/boulder/findBy/index/{I}")
    public Boulder findByIndex(@PathVariable long I){
        return repo.findById(I);
    }

    @CrossOrigin
    @GetMapping("/boulder/findBy/grade/{G}")
    public ArrayList<Boulder> findByGrade(@PathVariable String G){
        return repo.findByGrade(G);
    }

    @CrossOrigin
    @GetMapping("/boulder/findBy/gradeGreaterThan/{G}")
    public ArrayList<Boulder> findByGradeGreaterThan(@PathVariable String G){
        return repo.findByGradeGreaterThan(G);
    }

    @CrossOrigin
    @GetMapping("/Boulder/findBy/gradeGreaterThanEqual/{G}")
    public ArrayList<Boulder> findByGradeGreaterThanEqual(@PathVariable String G){
        return repo.findByGradeGreaterThanEqual(G);
    }

    @CrossOrigin
    @GetMapping("/boulder/findBy/gradeLessThan/{G}")
    public ArrayList<Boulder> findByGradeLessThan(@PathVariable String G){
        return repo.findByGradeLessThan(G);
    }

    @CrossOrigin
    @GetMapping("/boulder/findBy/gradeLessThanEqual/{G}")
    public ArrayList<Boulder> findByGradeLessThanEqual(@PathVariable String G){
        return repo.findByGradeLessThanEqual(G);
    }

    @CrossOrigin
    @GetMapping("/boulder/findBy/gradeBetween/{G1}/{G2}")
    public ArrayList<Boulder> findByGradeBetween(@PathVariable String G1, @PathVariable String G2){
        return repo.findByGradeBetween(G1, G2);
    }

    @CrossOrigin
    @GetMapping("/boulder/findBy/Climber/{C}")
    public ArrayList<Boulder> findByClimber(@PathVariable String C){
        return repo.findByClimber(C);
    }

    @CrossOrigin
    @GetMapping("/boulder/findBy/Date/{D}")
    public ArrayList<Boulder> findByDate(@PathVariable String D){
        return repo.findByDateNum(D);
    }

    @CrossOrigin
    @GetMapping("/boulder/findBy/location/{L}")
    public ArrayList<Boulder> findByLocationContaining(@PathVariable String L){
        return repo.findByLocationContainingIgnoreCase(L);
    }

    @CrossOrigin
    @PutMapping("/boulder/update/grade/{I}/{G}")
    public void updateBoulderGrade(@PathVariable long I, @PathVariable String G){
        Boulder boulderInDB = repo.findById(I);
        boulderInDB.setGrade(G);
        repo.saveAndFlush(boulderInDB);
    }

    @CrossOrigin
    @PutMapping("/boulder/update/date/{I}/{D}")
    public void updateBoulderDate(@PathVariable long I, @PathVariable String D){
        Boulder boulderInDB = repo.findById(I);
        boulderInDB.setDateNum(D);
        repo.saveAndFlush(boulderInDB);
    }

    @CrossOrigin
    @PutMapping("/boulder/update/location/{I}/{L}")
    public void updateBoulderLocation(@PathVariable long I, @PathVariable String L){
        Boulder boulderInDB = repo.findById(I);
        boulderInDB.setLocation(L);
        repo.saveAndFlush(boulderInDB);
    }

    @CrossOrigin
    @PutMapping("/boulder/update/climber/{I}/{C}")
    public void updateBoulderCLimber(@PathVariable long I, @PathVariable String C){
        Boulder boulderInDB = repo.findById(I);
        boulderInDB.setClimber(C);
        repo.saveAndFlush(boulderInDB);
    }

    @CrossOrigin
    @DeleteMapping("/boulder/delete/{I}")
    public void deleteBoulder(@PathVariable long I){
        repo.delete(repo.findById(I));
    }

}
