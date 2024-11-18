package com.example.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "orders") 
public class Order {
	
	
	    @Id 
	    @GeneratedValue(strategy = GenerationType.IDENTITY) 
	    private Long id; 
	 
	    @Column(nullable = false) 
	    private String orderNumber; 
	 
	    @Column(nullable = false) 
	    @Enumerated(EnumType.STRING) 
	    private OrderStatus status; 
	 
	    @Column(nullable = false) 
	    private LocalDateTime createdAt; 
	 
	    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true) 
	    private List<OrderItem> items = new ArrayList<>(); 
	 
	    @SuppressWarnings("unused")
		private BigDecimal totalAmount; 
	

}
