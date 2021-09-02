package com.example.telecom.beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "devices")
public class Device {
	
	//Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "device_id")
	private int deviceId;
	
	@Column(name = "phone_number", unique = true)
	private String phoneNumber;
	
	@Column(name = "device_name")
	private String deviceName;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "account_plan_id", referencedColumnName = "account_plan_id")
	private AccountPlan accountPlan;

	//Constructors
	public Device() {
	}

	//Getters and Setters
	public int getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(int id) {
		this.deviceId = id;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public AccountPlan getAccountPlan() {
		return accountPlan;
	}

	public void setAccountPlan(AccountPlan accountPlan) {
		this.accountPlan = accountPlan;
	}
}
