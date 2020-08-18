package com.dxctrainning.phone.services;

import com.dxctrainning.phone.entities.*;

public interface IPhoneService {
	Phone findPhoneById(int id);

	Phone add(Phone phone);

	void remove(int id);

}
