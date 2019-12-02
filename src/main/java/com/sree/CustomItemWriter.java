package com.sree;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.annotation.AfterStep;
import org.springframework.batch.core.annotation.BeforeStep;
import org.springframework.batch.item.ItemWriter;

import com.sree.model.Employee;

public class CustomItemWriter implements ItemWriter<Employee> {
	private static final int BUFFER_SIZE = 8192;
public File f;
byte[] b=new byte[BUFFER_SIZE];

	
	@Override
	public void write(List<? extends Employee> items) throws Exception {
		// TODO Auto-generated method stub
		for(Employee emp:items) {
			f=new File("outputs\\"+emp.getEmployee_id()+".txt");
			FileOutputStream fos = new FileOutputStream(f,true);
			b=(emp.toString()+"\r\n").getBytes();
			fos.write(b);
			
			fos.close();
			// branch1 commenting section 
		}
	}

}
