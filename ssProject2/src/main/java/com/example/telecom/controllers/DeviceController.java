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

import com.example.telecom.beans.Device;
import com.example.telecom.beans.Plan;
import com.example.telecom.services.TelecomSerivce;

@RestController
@RequestMapping("/devices")
@CrossOrigin(origins = "*")
public class DeviceController {
	
	@Autowired
	private TelecomSerivce service;
	
	@PostMapping(value = "/device")
	public Device save(@RequestBody Device device) {
		return service.saveDevice(device);
	}
	
	@GetMapping("/device")
	public List<Device> findAll() {
		return service.findAllDevices();
	}
	
	@GetMapping("/device/{deviceId}")
	public Device findDeviceById(@PathVariable int deviceId) {
		return service.findDeviceById(deviceId);
	}
	
	@PutMapping(value = "{deviceId}/addDevice/{planId}")
	public Plan deviceEnrollment(@PathVariable int deviceId, @PathVariable int planId) {
		Device d = service.findDeviceById(deviceId);
		Plan p = service.findPlanById(planId);
		service.putDeviceToPlan(d, p);
		return service.findPlanById(planId);
	}
}
