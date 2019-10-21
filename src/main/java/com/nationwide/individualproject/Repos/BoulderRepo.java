package com.nationwide.individualproject.Repos;

import com.nationwide.individualproject.data.Boulder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.Date;

@Repository
public interface BoulderRepo extends JpaRepository<Boulder, Integer> {
    ArrayList<Boulder> findAll();
    ArrayList<Boulder> findByGrade(String G);
    ArrayList<Boulder> findByGradeGreaterThan(String G);
    ArrayList<Boulder> findByGradeGreaterThanEqual(String G);
    ArrayList<Boulder> findByGradeLessThan(String G);
    ArrayList<Boulder> findByGradeLessThanEqual(String G);
    ArrayList<Boulder> findByGradeBetween(String G1, String G2);
    ArrayList<Boulder> findByLocation(String L);
    ArrayList<Boulder> findByClimber(String N);
    ArrayList<Boulder> findByDate(Date D);
}
