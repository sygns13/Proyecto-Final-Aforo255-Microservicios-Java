package com.aforo255.test.dao;

import org.springframework.data.repository.CrudRepository;

import com.aforo255.test.domain.Operation;

public interface IOperationDAO extends CrudRepository<Operation, Integer> {

}
