package com.example.telecom.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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
	
	@ManyToOne
	@JoinColumn(name = "plan_id", referencedColumnName = "plan_id")
	private Plan plan;

	//Contructors
	public Device() {
	}
	
	public Device(String phoneNumber, String deviceName, Plan plan) {
		this.phoneNumber = phoneNumber;
		this.deviceName = deviceName;
		this.plan = plan;
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

	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}
	
}
