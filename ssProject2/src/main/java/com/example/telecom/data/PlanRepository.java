package com.example.telecom.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.telecom.beans.Plan;

@Repository
public interface PlanRepository extends JpaRepository<Plan, Integer>{

}
