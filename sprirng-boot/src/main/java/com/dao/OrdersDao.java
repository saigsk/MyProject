package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdersDao {
	
	@Autowired
	OrdersRepository ordersRepository; 

}
