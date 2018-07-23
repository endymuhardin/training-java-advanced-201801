package com.muhardin.endy.training.javafundamental201801.objectstructure.composition;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class DiskonHariRaya extends Diskon {

    private String namaHariRaya;

	@Override
	public BigDecimal hitungDiskon(Transaksi t) {
		if("Lebaran".equals(namaHariRaya)){
            return t.total().multiply(new BigDecimal(0.1));
        } else if("Tahun Baru".equals(namaHariRaya)){
            return t.total().multiply(new BigDecimal(0.2));
        } else {
            return BigDecimal.ZERO;
        }
	}

}