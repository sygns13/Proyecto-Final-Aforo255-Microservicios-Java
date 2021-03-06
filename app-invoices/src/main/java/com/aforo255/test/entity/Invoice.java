package com.aforo255.test.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name="invoice")
public class Invoice implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_invoice; 
	
	@Column(name="amount")
	private double amount;
	
	@Column(name="state")
	private Integer state;

	public Invoice() {
	}

	public Invoice(Integer id_invoice, double amount, Integer state) {
		this.id_invoice = id_invoice;
		this.amount = amount;
		this.state = state;
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

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	} 
	
	
	
	

}
