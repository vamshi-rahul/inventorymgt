package com.dxctrainning.computer.services;
import com.dxctrainning.computer.entities.*;

public interface IComputerServices {
	Computer findPhoneById(int id);



	Computer addComputer(Computer computer);



	void remove(int id);

}
