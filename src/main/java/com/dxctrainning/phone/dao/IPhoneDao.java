package com.dxctrainning.phone.dao;

import com.dxctrainning.phone.entities.*;

public interface IPhoneDao {
	Phone findPhoneById(int id);

	Phone add(Phone phone);

	void remove(int id);
}
