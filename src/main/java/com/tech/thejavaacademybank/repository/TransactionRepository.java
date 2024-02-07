package com.tech.thejavaacademybank.repository;

import com.tech.thejavaacademybank.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, String> {
}
