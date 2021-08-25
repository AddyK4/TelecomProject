package com.example.telecom.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "account_id", referencedColumnName = "account_id")
	private Account account;

	//Constructors
	public Plan() {
	}
	
	public Plan(int maxLines, double price, Account account) {
		this.maxLines = maxLines;
		this.price = price;
		this.account = account;
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

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	
}
