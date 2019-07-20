package com.dmg.accountservices.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Transaction {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private LocalDateTime trasactionDateTime;
	
	private BigDecimal amount;
	
	private String trasactionType;
	
	private String narrative;
	
	@ManyToOne
    @JoinColumn(name="account_id")
    private Account account;
	
	public Transaction() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getTrasactionDateTime() {
		return trasactionDateTime;
	}

	public void setTrasactionDateTime(LocalDateTime trasactionDateTime) {
		this.trasactionDateTime = trasactionDateTime;
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

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
}
