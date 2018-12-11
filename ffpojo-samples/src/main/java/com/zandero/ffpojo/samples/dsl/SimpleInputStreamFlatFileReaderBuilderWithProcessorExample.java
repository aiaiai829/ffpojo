package com.zandero.ffpojo.samples.dsl;

import java.io.IOException;
import java.io.InputStream;

import com.zandero.ffpojo.FFPojoFlatFileReaderBuilder;
import com.zandero.ffpojo.dsl.ReadProcessor;
import com.zandero.ffpojo.exception.FFPojoException;
import com.zandero.ffpojo.samples.pojo.Customer;

public class SimpleInputStreamFlatFileReaderBuilderWithProcessorExample {

	private static final String INPUT_TXT_RESOURCE_CLASSPATH = "SimpleInputStreamFlatFileReaderExample.txt";
	
	
	public static void main(String[] args) {
		SimpleInputStreamFlatFileReaderBuilderWithProcessorExample example = new SimpleInputStreamFlatFileReaderBuilderWithProcessorExample();
		try {
			System.out.println("Making POJO from file system TXT FILE...");
			example.readCustomers();
			System.out.println("END !");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (FFPojoException e) {
			e.printStackTrace();
		}
	}
	
	public void readCustomers() throws IOException, FFPojoException {
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream(INPUT_TXT_RESOURCE_CLASSPATH);
		new FFPojoFlatFileReaderBuilder()
				.withInputStream(inputStream)
				.withRecordClass(Customer.class)
				.read(new ReadProcessor() {
					public void process(Object item) {
						Customer cust = (Customer)item;
						System.out.printf("[%d][%s][%s]\n", cust.getId(), cust.getName(), cust.getEmail());
					}
				});
				
	}
	
}
