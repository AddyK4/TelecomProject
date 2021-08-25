package com.example.telecom.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.telecom.beans.Account;
import com.example.telecom.services.TelecomSerivce;

@RestController
@RequestMapping("/accounts")
@CrossOrigin(origins = "*")
public class AccountController {

	@Autowired
	private TelecomSerivce service;
	
	
	/**
	 *     @RequestMapping(method = RequestMethod.POST, value = "/employee")  HandlerMapping: knows all of the potential "routes" for Dispatcher to refer
	 *     @ResponseBody // whatever is returned is written directly to the HTTP response body
	 *     by default: DispatcherServlet is going to expect a String to give to a ViewResolver to send the user to another HTML/JSP/page
	 * 
	 */
	@PostMapping(value = "/account")
	public Account save(@RequestBody Account account) { // get the employee JSON from the HTTP request body
		return service.saveAccount(account);
	}
	
	@GetMapping("/account")
	public List<Account> findAll() {
		return service.findAllAccounts();
	}
	
	@GetMapping("/account/{accountId}")
	public Account getAccountById(@PathVariable int accountId) {
		return service.findAccountById(accountId);
	}
	
	@PostMapping(value = "/getOneAccount")
	public Account getOneAccount(@RequestBody Account account) { // get the employee JSON from the HTTP request body
		List<Account> accounts = service.findAllAccounts();
		for (Account a : accounts) {
			if (a.getEmail().equals( account.getEmail() ) && a.getEmail().equals(account.getEmail())) {
				return a;
			}
		}
		return null;
	}
}
