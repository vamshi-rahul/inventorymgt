package com.dxctrainning.phone.entities;

import javax.persistence.Entity;
import com.dxctrainning.item.entities.*;
import com.dxctrainning.supplier.entities.*;

@Entity

public class Phone extends Item {
	private int storageSize;

	public Phone(int id, String name, Supplier supplier, int storageSize) {

		super(id, name, supplier);

		this.storageSize = storageSize;

	}

	public int getStorageSize() {
		return storageSize;
	}

	public void setStorageSize(int storageSize) {
		this.storageSize = storageSize;
	}

	@Override

	public boolean equals(Object obj) {

		if (this == obj)

			return true;

		if (obj == null || getClass() != obj.getClass())

			return false;

		Phone that = (Phone) obj;

		return that.getId() == this.getId();

	}

	@Override

	public int hashCode() {

		return this.getId();

	}

}
