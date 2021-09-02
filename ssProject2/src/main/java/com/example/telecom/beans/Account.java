package com.example.telecom.beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sun.istack.NotNull;

@Entity
@Table(name = "account")
public class Account {
	
	//Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "account_id")
	private int accountId;
	
	@Column(unique = true)
	@NotNull
	private String email;
	
	@NotNull
	private String password;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "account")
	private Set<AccountPlan> accountPlans = new HashSet<>(); 

	//Constructors
	public Account() {
	}

	//Getters and Setters
	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int account_id) {
		this.accountId = account_id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<AccountPlan> getAccountPlans() {
		return accountPlans;
	}

	public void setAccountPlans(Set<AccountPlan> accountPlans) {
		this.accountPlans = accountPlans;
	}
}
