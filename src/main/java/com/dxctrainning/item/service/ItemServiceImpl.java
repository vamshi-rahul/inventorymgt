package com.dxctrainning.item.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import com.dxctrainning.inventorymgt.exceptions.*;
import com.dxctrainning.item.dao.*;
import com.dxctrainning.item.entities.*;

@Transactional

@Service

public class ItemServiceImpl implements IItemService {
	@Autowired

	private IItemDao dao;

	@Override

	public Item addItem(Item item) {

		item = dao.addItem(item);

		return item;

	}

	@Override

	public void remove(int id) {

		validate(id);

		dao.remove(id);

	}

	@Override

	public Item findItemById(int id) {

		validate(id);

		Item item = dao.findItemById(id);

		return item;

	}

	public void validate(Object arg) {

		if (arg == null) {

			throw new InvalidArgumentException("argument is null");

		}

	}

}
