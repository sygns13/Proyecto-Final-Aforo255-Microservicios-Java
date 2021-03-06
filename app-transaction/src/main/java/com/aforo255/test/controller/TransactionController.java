package com.aforo255.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.aforo255.test.entity.Transaction;
import com.aforo255.test.service.ITransactionService;

@RestController
public class TransactionController {
	
	@Autowired
	ITransactionService _transaction ;	
	
	@GetMapping("listar")	
	public List<Transaction> listar (){
		
		return ( List<Transaction>)_transaction.findAll();
	}
	
	@GetMapping ("/transaction/{id_invoice}")
	public ResponseEntity<?> getByAccountId (@PathVariable Integer id_invoice){
		
		Iterable< Transaction> transaction= _transaction.findByInvoiceId(id_invoice);
		return ResponseEntity.ok(transaction);
	}

}
