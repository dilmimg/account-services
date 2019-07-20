package com.dmg.accountservices.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class TransactionDetails implements Serializable{

	private static final long serialVersionUID = 6710068979690001738L;

	private String accountNumber;
	
	private String accountType;
	
	@JsonFormat(pattern="dd-MM-yyyy")
	private LocalDate trasactionDate;
	
	private String currency;
	
	private BigDecimal amount;
	
	private String trasactionType;
	
	private String narrative;

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public LocalDate getTrasactionDate() {
		return trasactionDate;
	}

	public void setTrasactionDate(LocalDate trasactionDate) {
		this.trasactionDate = trasactionDate;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getTrasactionType() {
		return trasactionType;
	}

	public void setTrasactionType(String trasactionType) {
		this.trasactionType = trasactionType;
	}

	public String getNarrative() {
		return narrative;
	}

	public void setNarrative(String narrative) {
		this.narrative = narrative;
	}
	
}
