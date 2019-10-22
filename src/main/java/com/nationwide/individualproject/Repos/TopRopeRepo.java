package com.nationwide.individualproject.Repos;

import com.nationwide.individualproject.data.TopRope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;

@Repository
public interface TopRopeRepo extends JpaRepository<TopRope, Integer> {
    ArrayList<TopRope> findAll();
    ArrayList<TopRope> findByGrade(String G);
    ArrayList<TopRope> findByGradeGreaterThan(String G);
    ArrayList<TopRope> findByGradeGreaterThanEqual(String G);
    ArrayList<TopRope> findByGradeLessThan(String G);
    ArrayList<TopRope> findByGradeLessThanEqual(String G);
    ArrayList<TopRope> findByGradeBetween(String G1, String G2);
    ArrayList<TopRope> findByHeight(int H);
    ArrayList<TopRope> findByHeightGreaterThan(int H);
    ArrayList<TopRope> findByHeightGreaterThanEqual(int H);
    ArrayList<TopRope> findByHeightLessThan(int H);
    ArrayList<TopRope> findByHeightLessThanEqual(int H);
    ArrayList<TopRope> findByHeightBetween(int H1, int H2);
    ArrayList<TopRope> findByDate(String D);
    ArrayList<TopRope> findByLocation(String L);
    ArrayList<TopRope> findByClimber(String C);
    ArrayList<TopRope> findByPartner(String P);
}
