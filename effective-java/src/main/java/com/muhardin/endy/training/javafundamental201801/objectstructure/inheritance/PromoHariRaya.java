package com.muhardin.endy.training.javafundamental201801.objectstructure.inheritance;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

import lombok.Data;

@Data
public class PromoHariRaya extends TransaksiPromo {
    private LocalDate tanggalHariRaya;
    private String namaHariRaya;
    
    @Override
	public BigDecimal hitungDiskon() {
		if("Lebaran".equals(namaHariRaya)){
            return super.total().multiply(new BigDecimal(0.1));
        } else if("Tahun Baru".equals(namaHariRaya)){
            return super.total().multiply(new BigDecimal(0.2));
        } else {
            return BigDecimal.ZERO;
        }
    }
    
    @Override
    public BigDecimal total(){
        return super.total().subtract(hitungDiskon()).setScale(2, RoundingMode.HALF_EVEN);
    }
}