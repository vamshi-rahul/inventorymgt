package com.dxctrainning.phone.dao;

import javax.persistence.EntityManager;

import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import com.dxctrainning.inventorymgt.exceptions.*;
import com.dxctrainning.phone.entities.*;
import com.dxctrainning.supplier.entities.*;

@Repository

public class PhoneDaoImpl implements IPhoneDao {
	@PersistenceContext

	private EntityManager entityManager;

	@Override

	public Phone findPhoneById(int id) {

		Phone phone = entityManager.find(Phone.class, id);

		if (phone == null) {

			throw new SupplierNotFoundException("supplier not found for id=" + id);

		}

		return phone;

	}

	@Override

	public Phone add(Phone phone) {

		entityManager.persist(phone);

		return phone;

	}

	@Override

	public void remove(int id) {

		Phone phone = findPhoneById(id);

		entityManager.remove(phone);

	}

}
