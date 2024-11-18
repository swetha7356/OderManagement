package com.example.RequestDto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.example.model.OrderItem;
import com.example.model.OrderStatus;

import lombok.Data;

@Data
public class OrderRequestDto {
	
	 
	    private Long id; 
	 
	   
	    private String orderNumber; 
	 
	   
	    private OrderStatus status; 
	 
	   
	    private LocalDateTime createdAt; 
	 
	  
	    private List<OrderItem> items = new ArrayList<>(); 
	 
	   
		private BigDecimal totalAmount; 

}
