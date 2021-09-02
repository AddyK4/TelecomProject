package com.example.telecom.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.telecom.beans.Account;
import com.example.telecom.beans.Plan;
import com.example.telecom.services.TelecomSerivce;

@RestController
@RequestMapping("/plans")
@CrossOrigin(origins = "*")
public class PlanController {
	
	@Autowired
	private TelecomSerivce service;
	
	
	@PostMapping(value = "/plan")
	public Plan save(@RequestBody Plan plan) {
		return service.savePlan(plan);
	}
	
	@GetMapping
	public List<Plan> getAllPlans() {
		return service.findAllPlans();
	}
	
	@GetMapping(value = "/plan/{planId}")
	public Plan getPlanById(@PathVariable int planId) {
		return service.findPlanById(planId);
	}
	
//	@PutMapping(value = "{planId}/addPlan/{accountId}")
//	public Account PlanEnrollment(@PathVariable int planId, @PathVariable int accountId) {
//		Plan p = service.findPlanById(planId);
//		Account a = service.findAccountById(accountId);
//		service.putPlanToAccount(p, a);
//		return service.findAccountById(accountId);
//	}
}
