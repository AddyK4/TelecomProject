package com.example.telecom.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.telecom.beans.AccountPlan;

@Repository
public interface AccountPlanRepository extends JpaRepository<AccountPlan, Integer>{

}
