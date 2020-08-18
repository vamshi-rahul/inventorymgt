package com.dxctrainning.phone.services;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import com.dxctrainning.phone.dao.*;
import com.dxctrainning.phone.entities.*;
import com.dxctrainning.inventorymgt.exceptions.*;

@Transactional
@Service

public class PhoneServiceImpl implements IPhoneService {
	@Autowired

	private IPhoneDao dao;

	@Override

	public Phone findPhoneById(int id) {

		Phone phone = dao.findPhoneById(id);

		return phone;

	}

	@Override

	public Phone add(Phone phone) {

		validate(phone);

		phone = dao.add(phone);

		return phone;

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
