package com.dxctrainning.computer.entities;

import javax.persistence.Entity;

import javax.persistence.Table;

import com.dxctrainning.item.entities.*;
import com.dxctrainning.supplier.entities.*;

@Entity

@Table(name = "computers")

public class Computer extends Item {
	private int diskSize;

	public Computer(int id, String name, Supplier supplier, int diskSize) {

		super(id, name, supplier);

		this.diskSize = diskSize;

	}

	public int getDiskSize() {

		return diskSize;

	}

	public void setDiskSize(int diskSize) {

		this.diskSize = diskSize;

	}

}
