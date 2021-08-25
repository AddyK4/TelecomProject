package com.example.telecom.beans;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "account")
public class Account {
	
	//testing commit changes
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
	
	@OneToMany(mappedBy = "account")
	private Set<Plan> plans; 

	//Constructors
	public Account() {
	}
	
	public Account(String email, String password) {
		this.email = email;
		this.password = password;
	}
	
	public Account(String email, String password, Set<Plan> plans) {
		this.email = email;
		this.password = password;
		this.plans = plans;
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

	public Set<Plan> getPlans() {
		return plans;
	}

	public void setPlans(Set<Plan> plans) {
		this.plans = plans;
	}
}
