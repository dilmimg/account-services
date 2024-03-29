package com.dmg.accountservices.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dmg.accountservices.entity.Account;

@Repository
public interface AccountDao extends JpaRepository<Account, Long>{

}
