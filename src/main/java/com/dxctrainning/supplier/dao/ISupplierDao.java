package com.dxctrainning.supplier.dao;
import com.dxctrainning.supplier.entities.*;



public interface ISupplierDao {

	Supplier findSupplierById(int id);



    Supplier add(Supplier supplier);



    void remove(int id);

	



}
