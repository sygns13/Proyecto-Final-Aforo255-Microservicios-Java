package com.aforo255.test.service;

import org.springframework.stereotype.Service;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.aforo255.test.entity.Invoice;
import com.aforo255.test.entity.Operation;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class OperationEvents {
	@Autowired
	private IInvoiceService invoiceService ; 
	private Logger log = LoggerFactory.getLogger(OperationEvents.class);
	@Autowired
	private ObjectMapper objectMapper ; 
	
	public void processOperationEvent(ConsumerRecord<Integer, String> consumerRecord) throws JsonMappingException, JsonProcessingException {

		Invoice invoice = new Invoice();
		Operation event = objectMapper.readValue(consumerRecord.value(), Operation.class);
		invoice = invoiceService.findById(event.getId_invoice());
		
		//logica de actualizacion de monto de la facura
		double montoActual = invoice.getAmount();
		double pago = event.getAmount();
		
		double saldo = montoActual - pago;
		invoice.setAmount(saldo);
		
		//Logica actualizacion de estado
		if(saldo <= 0)
			invoice.setState(1); // 0 No pagado -- 1 Pagado
		
		log.info("Actulizando Invoice ***"+event.getId_invoice());
		invoiceService.save(invoice);
	}
	
}