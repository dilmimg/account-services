package com.dmg.accountservices.api;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dmg.accountservices.model.TransactionDetails;
import com.dmg.accountservices.service.TransactionService;

@RestController
public class TransactionController {

	@Autowired
	private TransactionService transactionService;
	
	@GetMapping("/accounts/{accountId}/transactions")
	public List<TransactionDetails> getTransactions(@PathVariable("accountId") @NotNull Long accountId){
		return transactionService.getTransactionsByAccount(accountId);
	}
}
