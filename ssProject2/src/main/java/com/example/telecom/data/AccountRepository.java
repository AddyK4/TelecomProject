package com.example.telecom.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.telecom.beans.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer>{

}
