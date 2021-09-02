package com.example.telecom.beans;

import java.util.Set;

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
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "account_plan")
public class AccountPlan {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "account_plan_id")
	int accountPlanId;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "account_id", referencedColumnName = "account_id")
	private Account account;
	
	@ManyToOne
	@JoinColumn(name = "plan_id", referencedColumnName = "plan_id")
	private Plan plan;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "accountPlan")
	private Set<Device> devices;

	public AccountPlan() {
	}

	public int getAccountPlanId() {
		return accountPlanId;
	}

	public void setAccountPlanId(int accountPlanId) {
		this.accountPlanId = accountPlanId;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}
	
	public Set<Device> getDevices() {
		return devices;
	}

	public void setDevices(Set<Device> devices) {
		this.devices = devices;
	}

	@Override
	public String toString() {
		return "AccountPlan [accountPlanId=" + accountPlanId + ", account=" + account + ", plan=" + plan + ", device="
				+ devices + "]";
	}
	
}
