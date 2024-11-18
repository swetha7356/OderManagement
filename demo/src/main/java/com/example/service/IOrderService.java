package com.example.service;

import com.example.RequestDto.OrderRequestDto;
import com.example.model.Order;

public interface IOrderService {
	
	public Order saveOrder(OrderRequestDto dto);

}
