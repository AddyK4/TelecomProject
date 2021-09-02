package com.example.telecom.beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.sun.istack.NotNull;

@Entity
@Table(name = "plan")
public class Plan {
	
	//Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "plan_id")
	private int planId;
	
	@Column(name = "max_lines")
	@NotNull
	private int maxLines;
	
	@NotNull
	private double price;
	
	@JsonBackReference
	@OneToMany(mappedBy = "plan")
	private Set<AccountPlan> accountPlans = new HashSet<>();

	//Constructors
	public Plan() {
	}
	
	//Getters and Setters
	public int getPlanId() {
		return planId;
	}

	public void setPlanId(int plan_id) {
		this.planId = plan_id;
	}

	public int getMaxLines() {
		return maxLines;
	}

	public void setMaxLines(int maxLines) {
		this.maxLines = maxLines;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Set<AccountPlan> getAccountPlans() {
		return accountPlans;
	}

	public void setAccountPlans(Set<AccountPlan> accountPlans) {
		this.accountPlans = accountPlans;
	}
}
