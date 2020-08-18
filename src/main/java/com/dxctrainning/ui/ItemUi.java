package com.dxctrainning.ui;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;
import com.dxctrainning.computer.entities.*;
import com.dxctrainning.computer.services.*;
import com.dxctrainning.item.entities.*;
import com.dxctrainning.item.service.*;
import com.dxctrainning.phone.entities.*;
import com.dxctrainning.phone.services.*;
import com.dxctrainning.supplier.entities.*;
import com.dxctrainning.supplier.services.*;

@Component

public class ItemUi {
	@Autowired

	private IComputerServices computerService;

	@Autowired

	private IPhoneService phoneService;

	@Autowired

	private IItemService itemService;

	@Autowired

	private ISupplierService supplierService;

	@PostConstruct

	void runApp() {

		System.out.println("Sprint 1");

		Supplier supplier1 = new Supplier(1, "harish");

		Supplier supplier2 = new Supplier(2, "neeraj");

		Supplier supplier3 = new Supplier(3, "pranay");

		supplierService.add(supplier1);

		supplierService.add(supplier2);

		supplierService.add(supplier3);

		System.out.println("Sprint 2");

		Item item1 = new Item(11, "iphone", supplier1);

		Item item2 = new Item(22, "samsung", supplier2);

		Item item3 = new Item(33, "Nokia", supplier3);

		itemService.addItem(item1);

		itemService.addItem(item2);

		itemService.addItem(item3);
		System.out.println("Sprint 3");

		Phone ph1 = new Phone(101, "A15", supplier1, 12);

		phoneService.add(ph1);

		Phone ph2 = new Phone(202, "B54", supplier2, 67);

		phoneService.add(ph2);

		System.out.println("Sprint 4");

		Computer computer1 = new Computer(2035, "HP", supplier3, 564);

		computerService.addComputer(computer1);

		Computer computer2 = new Computer(2137, "Lenovo", supplier2, 543);

		computerService.addComputer(computer2);

		int id1 = item1.getId();

		Item fetchedItem1 = itemService.findItemById(id1);

		System.out.println("id is" + fetchedItem1.getId() + "name is" + fetchedItem1.getName());

	}

}
