package com.aforo255.test.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.aforo255.test.entity.Transaction;

public interface TransactionRepository extends MongoRepository<Transaction, String> {
	@Query("{'id_invoice':?0}")
	public Iterable<Transaction> findByInvoiceId(Integer id_invoice);
}