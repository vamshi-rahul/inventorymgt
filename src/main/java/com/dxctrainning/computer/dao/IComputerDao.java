package com.dxctrainning.computer.dao;

import com.dxctrainning.computer.entities.*;

public interface IComputerDao {
	Computer findComputerById(int id);

	Computer addComputer(Computer computer);

	void remove(int id);

}
