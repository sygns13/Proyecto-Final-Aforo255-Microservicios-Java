package com.aforo255.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.aforo255.test.entity.Invoice;
import com.aforo255.test.service.IInvoiceService;

@RestController
public class InvoiceController {
	@Autowired
	private IInvoiceService service;

	@GetMapping("listar")
	public List<Invoice> listar() {
		return service.findAll();
	}

	@GetMapping("/ver/{id}")
	public Invoice detalle(@PathVariable Integer id) {

		Invoice invoice = service.findById(id);
		return invoice;
	}
}
