package com.dxctrainning.supplier.services;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import com.dxctrainning.supplier.dao.ISupplierDao;
import com.dxctrainning.supplier.entities.*;

import com.dxctrainning.inventorymgt.exceptions.InvalidArgumentException;

@Transactional

@Service

public class ISupplierServiceImpl implements ISupplierService {
	@Autowired

	private ISupplierDao dao;

	@Override

	public Supplier findSupplierById(int id) {

		Supplier supplier = dao.findSupplierById(id);

		return supplier;

	}

	@Override

	public Supplier add(Supplier supplier) {

		validate(supplier);

		supplier = dao.add(supplier);

		return supplier;

	}

	@Override

	public void remove(int id) {

		dao.remove(id);

	}

	public void validate(Object arg) {

		if (arg == null) {

			throw new InvalidArgumentException("argument is null");

		}

	}

}
