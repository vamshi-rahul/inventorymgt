package com.dxctrainning.supplier.services;

import com.dxctrainning.supplier.entities.*;

public interface ISupplierService {

	Supplier findSupplierById(int id);

	Supplier add(Supplier supplier);

	void remove(int id);

}