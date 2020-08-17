package com.dxctrainning.item.service;

import com.dxctrainning.item.entities.*;

public interface IItemService {
	Item addItem(Item item);

	void remove(int id);

	Item findItemById(int id);
}
