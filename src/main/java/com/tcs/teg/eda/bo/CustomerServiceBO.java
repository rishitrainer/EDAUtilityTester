package com.tcs.teg.eda.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tcs.teg.eda.dao.CustomerServiceDAO;
import com.tcs.teg.eda.dto.CustomerTo;
import com.tcs.teg.eda.util.EventGenerationUtil;

@Component
public class CustomerServiceBO {
	
	@Autowired
	CustomerServiceDAO dao;
	
	@Autowired
	EventGenerationUtil event;
	
	public CustomerTo executeCreateCustomer(CustomerTo customer) {
		//TO-DO: Complete the call
		
		// if call complete successfully
		// Event Generation Code start
		/*
		 * 1. Create an Event Message - Event To 
		 * 2. create JSON from EventTO
		 * 3. Send that message to Kafka Topic
		 */
		event.sendEvent("message to be generated");
		
		return null;
	}

}
