package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RequestDto.OrderRequestDto;
import com.example.model.Order;
import com.example.service.IOrderService;

@RestController
@RequestMapping("/api/v1")
public class OrderRestController {
	
	@Autowired IOrderService service;
	
	@PostMapping("orders")
	public ResponseEntity<Order> saveOrders(@RequestBody OrderRequestDto dto){
		
		Order savedData = service.saveOrder(dto);
		
		 HttpHeaders responseHeaders = new HttpHeaders();
	      
	        return new ResponseEntity<>(savedData, responseHeaders, HttpStatus.CREATED);
		
		
		
	}

}
