package com.muhardin.endy.training.designpatterns.factory;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class DiskonHariRaya implements Diskon {

    private String nama;
    private BigDecimal persentase;

	public BigDecimal hitungDiskon(Transaksi t) {
		return t.total().multiply(persentase);
	}

}