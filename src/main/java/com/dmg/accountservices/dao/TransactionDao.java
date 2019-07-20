package com.dmg.accountservices.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dmg.accountservices.entity.Transaction;

@Repository
public interface TransactionDao extends JpaRepository<Transaction, Long>{

}
