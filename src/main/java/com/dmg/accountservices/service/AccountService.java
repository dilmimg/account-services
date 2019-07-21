package com.dmg.accountservices.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dmg.accountservices.dao.AccountDao;
import com.dmg.accountservices.entity.Account;
import com.dmg.accountservices.model.AccountDetails;

@Service
public class AccountService {
	
	@Autowired
	private AccountDao accountDao;
	
	
	public List<AccountDetails> getAllAccounts(){
		
		List<Account> accountList = this.accountDao.findAll();
		return convertToAccountDetails(accountList);
		
	}
	
	private List<AccountDetails> convertToAccountDetails(List<Account> accountList) {
		List<AccountDetails> accountDetailsList = new ArrayList();
		
		accountList.forEach(account -> {
			AccountDetails accountDetails = new AccountDetails();
			accountDetails.setAccountId(account.getId());
			accountDetails.setAccountName(account.getAccountName());
			accountDetails.setAccountNumber(account.getAccountNumber());
			accountDetails.setAccountType(account.getAccountType()); // TODO map from account type enum 
			accountDetails.setCurrency(account.getCurrency()); // TODO map from currency type enum 
			accountDetails.setBalanceAmount(account.getBalanceAmount());
			accountDetails.setBalanceDate(LocalDate.now());
			
			accountDetailsList.add(accountDetails);
		});
		
		return accountDetailsList;
	}
	
}
