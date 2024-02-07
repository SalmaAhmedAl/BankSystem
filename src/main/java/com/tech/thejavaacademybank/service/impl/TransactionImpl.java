package com.tech.thejavaacademybank.service.impl;

import com.tech.thejavaacademybank.dto.TransactionDto;
import com.tech.thejavaacademybank.entity.Transaction;
import com.tech.thejavaacademybank.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TransactionImpl implements TransactionService{
    @Autowired
    TransactionRepository transactionRepository;

    @Override
    public void saveTransaction(TransactionDto transactionDto) {
        Transaction transaction = Transaction.builder()
                .transactionType(transactionDto.getTransactionType())
                .accountNumber(transactionDto.getAccountNumber())
                .amount(transactionDto.getAmount())
                .status("SUCCESS")
                .build();
        transactionRepository.save(transaction);
        System.out.println("Transaction saved successfully");
    }
}
