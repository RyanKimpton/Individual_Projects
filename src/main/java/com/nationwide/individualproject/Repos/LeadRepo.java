package com.nationwide.individualproject.Repos;

import com.nationwide.individualproject.data.Lead;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface LeadRepo extends JpaRepository<Lead, Integer> {
    Lead findById(long I);
    ArrayList<Lead> findAll();
    ArrayList<Lead> findByGrade(String G);
    ArrayList<Lead> findByGradeGreaterThan(String G);
    ArrayList<Lead> findByGradeGreaterThanEqual(String G);
    ArrayList<Lead> findByGradeLessThan(String G);
    ArrayList<Lead> findByGradeLessThanEqual(String G);
    ArrayList<Lead> findByGradeBetween(String G1, String G2);
    ArrayList<Lead> findByHeight(int H);
    ArrayList<Lead> findByHeightGreaterThan(int H);
    ArrayList<Lead> findByHeightGreaterThanEqual(int H);
    ArrayList<Lead> findByHeightLessThan(int H);
    ArrayList<Lead> findByHeightLessThanEqual(int H);
    ArrayList<Lead> findByHeightBetween(int H1, int H2);
    ArrayList<Lead> findByDateNum(String D);
    ArrayList<Lead> findByLocation(String L);
    ArrayList<Lead> findByClimber(String C);
    ArrayList<Lead> findByPartner(String P);
}
