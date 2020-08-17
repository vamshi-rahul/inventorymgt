package com.dxctrainning.item.dao;

import com.dxctrainning.item.entities.*;

public interface IItemDao {
	Item addItem(Item item);

	void remove(int id);

	Item findItemById(int id);

}
