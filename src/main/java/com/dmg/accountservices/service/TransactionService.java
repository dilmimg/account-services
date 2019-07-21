package com.dmg.accountservices.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dmg.accountservices.dao.AccountDao;
import com.dmg.accountservices.entity.Account;
import com.dmg.accountservices.entity.Transaction;
import com.dmg.accountservices.error.AccountNotFoundException;
import com.dmg.accountservices.model.TransactionDetails;

@Service
public class TransactionService {

	@Autowired
	private AccountDao accountDao;
	
	public List<TransactionDetails> getTransactionsByAccount(Long accountId){
		Optional<Account> account = this.accountDao.findById(accountId);
	
		if (!account.isPresent())
			throw new AccountNotFoundException(String.format("account %d does not exist", accountId));
		
		return convertToTransactionDetails(account.get(), account.get().getTransactions());
	}
	
	private List<TransactionDetails> convertToTransactionDetails(Account account, List<Transaction> transactionList) {
		List<TransactionDetails> transactionDetailsList = new ArrayList();
		
		transactionList.forEach(transaction -> {
			TransactionDetails transactionDetails = new TransactionDetails();
			transactionDetails.setAccountNumber(account.getAccountNumber());
			transactionDetails.setAccountType(account.getAccountType()); //TODO map from account type enum 
			transactionDetails.setAmount(transaction.getAmount());
			transactionDetails.setCurrency(account.getCurrency()); //TODO map from currency type enum 
			transactionDetails.setTrasactionType(transaction.getTrasactionType()); //TODO map from transaction type enum 
			transactionDetails.setNarrative(transaction.getNarrative());
			transactionDetails.setTrasactionDate(transaction.getTrasactionDateTime().toLocalDate());
			transactionDetailsList.add(transactionDetails);
		});
		
		return transactionDetailsList;
	}
}
