package com.nationwide.individualproject.Repos;

import com.nationwide.individualproject.data.Boulder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;

@Repository
public interface BoulderRepo extends JpaRepository<Boulder, Integer> {
    Boulder findById(long I);
    ArrayList<Boulder> findAll();
    ArrayList<Boulder> findAllByOrderByGrade();
    ArrayList<Boulder> findAllByOrderByDateNum();
    ArrayList<Boulder> findAllByOrderByLocation();
    ArrayList<Boulder> findAllByOrderByClimber();
    ArrayList<Boulder> findByGrade(String G);
    ArrayList<Boulder> findByGradeGreaterThan(String G);
    ArrayList<Boulder> findByGradeGreaterThanEqual(String G);
    ArrayList<Boulder> findByGradeLessThan(String G);
    ArrayList<Boulder> findByGradeLessThanEqual(String G);
    ArrayList<Boulder> findByGradeBetween(String G1, String G2);
    ArrayList<Boulder> findByClimber(String N);
    ArrayList<Boulder> findByDateNum(String D);
    ArrayList<Boulder> findByLocationContainingIgnoreCase(String G);
}
