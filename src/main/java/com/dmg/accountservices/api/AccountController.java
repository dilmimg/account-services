package com.dmg.accountservices.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dmg.accountservices.model.AccountDetails;
import com.dmg.accountservices.service.AccountService;

@RestController
public class AccountController {
	
	@Autowired
	private AccountService accountService;
	
	@GetMapping("/accounts")
    public List<AccountDetails> getAccounts(){
       return accountService.getAllAccounts();
    }
}
