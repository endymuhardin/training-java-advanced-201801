package com.muhardin.endy.training.javafundamental201801.objectstructure.composition;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class DiskonMember extends Diskon {
    private String namaMember;

	@Override
	public BigDecimal hitungDiskon(Transaksi t) {
		return new BigDecimal(10000);
	}

}