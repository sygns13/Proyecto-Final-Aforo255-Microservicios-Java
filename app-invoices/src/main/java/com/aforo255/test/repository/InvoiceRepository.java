package com.aforo255.test.repository;

import org.springframework.data.repository.CrudRepository;
import com.aforo255.test.entity.Invoice;

public interface InvoiceRepository extends CrudRepository<Invoice, Integer> {

}
