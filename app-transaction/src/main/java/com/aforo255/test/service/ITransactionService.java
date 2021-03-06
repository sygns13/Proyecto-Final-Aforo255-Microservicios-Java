package com.aforo255.test.service;

import com.aforo255.test.entity.Transaction;

public interface ITransactionService {
	public Transaction save(Transaction transaction);
	public Iterable<Transaction> findByInvoiceId(Integer id_invoice);
	public Iterable <Transaction> findAll();
}