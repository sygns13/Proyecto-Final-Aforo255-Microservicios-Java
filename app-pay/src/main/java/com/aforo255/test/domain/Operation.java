package com.aforo255.test.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="operation")
public class Operation implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_operation;
	
	@Column(name="id_invoice")
	private Integer id_invoice; 
	
	@Column(name="amount")
	private double amount;
	
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	@Column(name="datetime")
	private LocalDateTime datetime;

	public Operation() {
	}

	public Operation(Integer id_operation, Integer id_invoice, double amount, LocalDateTime datetime) {
		this.id_operation = id_operation;
		this.id_invoice = id_invoice;
		this.amount = amount;
		this.datetime = datetime;
	}

	public Integer getId_operation() {
		return id_operation;
	}

	public void setId_operation(Integer id_operation) {
		this.id_operation = id_operation;
	}

	public Integer getId_invoice() {
		return id_invoice;
	}

	public void setId_invoice(Integer id_invoice) {
		this.id_invoice = id_invoice;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public LocalDateTime getDatetime() {
		return datetime;
	}

	public void setDatetime(LocalDateTime datetime) {
		this.datetime = datetime;
	}
	
	
	
	

}
