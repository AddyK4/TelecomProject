package com.example.telecom.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.telecom.beans.Account;
import com.example.telecom.beans.Device;
import com.example.telecom.beans.Plan;
import com.example.telecom.data.AccountRepository;
import com.example.telecom.data.DeviceRepository;
import com.example.telecom.data.PlanRepository;

@Service
public class TelecomSerivce {

	@Autowired
	private AccountRepository accountRepository;
	@Autowired
	private PlanRepository planRepository;
	@Autowired
	private DeviceRepository deviceRepository;
	
	//Account ------------------------------
	public Account saveAccount(Account account) {
		return accountRepository.save(account);
	}
	
	public List<Account> findAllAccounts() {
		return accountRepository.findAll();
	}
	
	public void updateAccount(Account account, Integer id) {
		if ((account.getAccountId() == id) && accountRepository.findById(account.getAccountId()).isPresent()) {
			accountRepository.save(account);
		}else {
			//throw new ValidationException();
		}
	}
	
	public Account findAccountById(Integer id) {
		Optional<Account> optional = accountRepository.findById(id);
		return optional.isPresent() ? optional.get() : null;
	}
	
	//Plan -------------------------
	public Plan savePlan(Plan plan) {
		return planRepository.save(plan);
	}
	
	public List<Plan> findAllPlans() {

		return planRepository.findAll();
	}
	
	public void updatePlan(Plan plan, Integer id) {
		if ((plan.getPlanId() == id) && planRepository.findById(plan.getPlanId()).isPresent()) {
			planRepository.save(plan);
		}else {
			//throw new ValidationException();
		}
	}
	
	public Plan findPlanById(Integer id) {
		Optional<Plan> optional = planRepository.findById(id);
		return optional.isPresent() ? optional.get() : null;
	}

	public Plan putPlanToAccount(Plan p, Account a) {
		p.setAccount(a);
		return planRepository.save(p);
	}
	
	//Device -------------------------
	
	public Device saveDevice(Device phone) {
		return deviceRepository.save(phone);
	}
	
	
	public List<Device> findAllDevices() {

		return deviceRepository.findAll();
	}
	
	public void updateDevice(Device device, Integer id) {
		if ((device.getDeviceId() == id) && deviceRepository.findById(device.getDeviceId()).isPresent()) {
			deviceRepository.save(device);
		}else {
			//throw new ValidationException(); 
		}
	}
	
	public Device findDeviceById(Integer id) {
		Optional<Device> optional = deviceRepository.findById(id);
		return optional.isPresent() ? optional.get() : null;
	}
	
	public Device putDeviceToPlan(Device d, Plan p){
		d.setPlan(p);
		return deviceRepository.save(d);
	}

}
