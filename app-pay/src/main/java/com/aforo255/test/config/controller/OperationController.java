package com.aforo255.test.config.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.aforo255.test.domain.Operation;
import com.aforo255.test.producer.PayEventProducer;
import com.aforo255.test.service.IOperationService;
import com.fasterxml.jackson.core.JsonProcessingException;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OperationController {
	
	@Autowired
	private IOperationService service;
	
	@Autowired
	PayEventProducer payProducer;
	
	private Logger log = LoggerFactory.getLogger(OperationController.class);
	
	@PostMapping("/v1/payevent")
	public ResponseEntity<Operation> postDepositEvent(@RequestBody Operation operation) throws JsonProcessingException {
		log.info("antes de transql");
		Operation transql = service.save(operation);
		log.info("despues de transql");
		log.info("antes de sendDepositEvent");
		payProducer.sendDepositEvent(transql);
		log.info("despues de sendDepositEvent");
		return ResponseEntity.status(HttpStatus.CREATED).body(transql);
	}

}
