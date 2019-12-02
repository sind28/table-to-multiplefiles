package com.sree;

import org.springframework.batch.item.ItemProcessor;

import com.sree.model.Employee;

public class CustomItemProcessor implements ItemProcessor<Employee, Employee>{

	@Override
	public Employee process(Employee item) throws Exception {
	
		return item;
		//comment in processor
	}

}
