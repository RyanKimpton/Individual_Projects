package com.nationwide.individualproject.Repos;

import com.nationwide.individualproject.data.TopRope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface TopRopeRepo extends JpaRepository<TopRope, Integer> {
    TopRope findById(long I);
    ArrayList<TopRope> findAll();
    ArrayList<TopRope> findAllByOrderByGrade();
    ArrayList<TopRope> findAllByOrderByHeight();
    ArrayList<TopRope> findAllByOrderByDateNum();
    ArrayList<TopRope> findAllByOrderByLocation();
    ArrayList<TopRope> findAllByOrderByClimber();
    ArrayList<TopRope> findAllByOrderByPartner();
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
    ArrayList<TopRope> findByDateNum(String D);
    ArrayList<TopRope> findByLocation(String L);
    ArrayList<TopRope> findByClimber(String C);
    ArrayList<TopRope> findByPartner(String P);
}
