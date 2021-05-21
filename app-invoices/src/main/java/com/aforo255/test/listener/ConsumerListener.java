package com.aforo255.test.listener;


import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.aforo255.test.service.OperationEvents;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Component
public class ConsumerListener {
	
	@Autowired
	private OperationEvents _operationEvents;
	private Logger log = LoggerFactory.getLogger(ConsumerListener.class);
	
	@KafkaListener(topics = {"operation-events"})
	public void OnMessage(ConsumerRecord<Integer, String> consumerRecord) throws JsonMappingException, JsonProcessingException {
		log.info("*************** MICROSERVICE Invoice *******************");
		log.info("ConsumerRecord : {}", consumerRecord.value());
		_operationEvents.processOperationEvent(consumerRecord);
	}

}
