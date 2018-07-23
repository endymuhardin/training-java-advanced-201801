package com.muhardin.endy.training.javafundamental201801.objectstructure.inheritance;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class PromoPremiumMember extends TransaksiPromo {
    private String namaMember;

	@Override
	public BigDecimal hitungDiskon() {
		return new BigDecimal(10000);
	}
    
}