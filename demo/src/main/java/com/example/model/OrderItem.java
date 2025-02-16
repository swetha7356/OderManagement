package com.example.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
@Table(name = "order_items") 
public class OrderItem {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY) 
	    private Long id; 
	 
	    @ManyToOne(fetch = FetchType.LAZY) 
	    @JoinColumn(name = "order_id", nullable = false) 
	    private Order order; 
	 
	    @NotBlank
	    @Column(nullable = false) 
	    private String productCode; 
	 
	    @NotNull
	    @Column(nullable = false) 
	    private Integer quantity; 
	 
	    @Column(nullable = false) 
	    private BigDecimal unitPrice;

}
