package com.dxctrainning.computer.services;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import com.dxctrainning.computer.entities.*;
import com.dxctrainning.computer.dao.*;
import com.dxctrainning.inventorymgt.exceptions.*;

@Transactional

@Service

public class ComputerServicesImpl implements IComputerServices {
	@Autowired

	private IComputerDao dao;

	@Override

	public Computer findPhoneById(int id) {

		Computer computer = dao.findComputerById(id);

		return computer;

	}

	@Override

	public Computer addComputer(Computer computer) {

		validate(computer);

		computer = dao.addComputer(computer);

		return computer;

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
