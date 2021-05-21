package com.aforo255.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aforo255.test.dao.IOperationDAO;
import com.aforo255.test.domain.Operation;

@Service
public class OperationServiceImpl implements IOperationService {
	
	@Autowired
	private IOperationDAO _operationDao;

	@Override
	public Operation save(Operation operation) {
		return _operationDao.save(operation);
	}

}
