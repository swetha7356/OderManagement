package com.example.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RequestDto.OrderRequestDto;
import com.example.model.Order;
import com.example.model.OrderItem;
import com.example.service.IOrderService;

import Repository.IOrderDao;

@Service
public class OrderImpl implements IOrderService{
	
	@Autowired
	private IOrderDao orderDao;

	@Override
	public Order saveOrder(OrderRequestDto dto) {
		try {
			
			List<OrderItem> orderData = dto.getItems();
			 
			Order orderObj = new Order();
			BeanUtils.copyProperties(dto, orderObj);
			Order savedObj = orderDao.save(orderObj);
			
			
			
			for (OrderItem orderItem : orderData) {
				if(orderItem.getQuantity()<0) {
					return null;
				}
				
				
			}
			
			return savedObj;
			
			
			
			
			
			
			
			
		}catch (Exception e) {
			
			return null;
			
		}
	}

}