package com.aforo255.test.entity;

import java.io.Serializable;


public class Operation implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer id_operation; 
	private double amount ;
	private Integer id_invoice; 
	private String datetime;
	
	public Operation() {
	}

	public Operation(Integer id_operation, double amount, Integer id_invoice, String datetime) {
		this.id_operation = id_operation;
		this.amount = amount;
		this.id_invoice = id_invoice;
		this.datetime = datetime;
	}

	public Integer getId_operation() {
		return id_operation;
	}

	public void setId_operation(Integer id_operation) {
		this.id_operation = id_operation;
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

	public String getDatetime() {
		return datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	
	


	
	
	
	

}
