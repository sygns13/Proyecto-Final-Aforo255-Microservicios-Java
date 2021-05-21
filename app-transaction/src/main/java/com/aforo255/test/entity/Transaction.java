package com.aforo255.test.entity;

import java.time.LocalDateTime;
import org.bson.codecs.pojo.annotations.BsonId;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document(collection = "transaction")
public class Transaction {
	
	@BsonId
	private String id_transaccion ; 
	private double amount ;
	private Integer id_invoice;
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	private LocalDateTime datetime;
	
	public Transaction() {
	}

	public Transaction(String id_transaccion, double amount, Integer id_invoice, LocalDateTime datetime) {
		this.id_transaccion = id_transaccion;
		this.amount = amount;
		this.id_invoice = id_invoice;
		this.datetime = datetime;
	}

	public String getId_transaccion() {
		return id_transaccion;
	}

	public void setId_transaccion(String id_transaccion) {
		this.id_transaccion = id_transaccion;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Integer getId_invoice() {
		return id_invoice;
	}

	public void setId_invoice(Integer id_invoice) {
		this.id_invoice = id_invoice;
	}

	public LocalDateTime getDatetime() {
		return datetime;
	}

	public void setDatetime(LocalDateTime datetime) {
		this.datetime = datetime;
	}
	
	
	
	
	
	

}