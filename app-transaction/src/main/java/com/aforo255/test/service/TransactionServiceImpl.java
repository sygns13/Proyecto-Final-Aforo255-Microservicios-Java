package com.aforo255.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aforo255.test.entity.Transaction;
import com.aforo255.test.repository.TransactionRepository;
@Service
public class TransactionServiceImpl implements ITransactionService {

	@Autowired
	TransactionRepository _repository;
	
	@Override
	public Transaction save(Transaction transaction) {
		// TODO Auto-generated method stub
		return _repository.save(transaction);
	}

	@Override
	public Iterable<Transaction> findAll() {
		// TODO Auto-generated method stub
		return _repository.findAll();
	}

	@Override
	public Iterable<Transaction> findByInvoiceId(Integer id_invoice) {
		return _repository.findByInvoiceId(id_invoice);
	}

}