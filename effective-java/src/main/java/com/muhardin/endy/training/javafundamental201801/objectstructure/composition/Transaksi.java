package com.muhardin.endy.training.javafundamental201801.objectstructure.composition;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import com.muhardin.endy.training.javafundamental201801.objectstructure.TransaksiDetail;

import lombok.Data;

@Data
public class Transaksi {
    private LocalDateTime waktuTransaksi = LocalDateTime.now();

    private Set<Diskon> daftarDiskon = new HashSet<Diskon>();

    private Set<TransaksiDetail> daftarBelanja 
        = new HashSet<TransaksiDetail>();


    public BigDecimal tagihan(){
        return total().subtract(diskon()).setScale(2, RoundingMode.HALF_EVEN);
    }
    
    public BigDecimal total(){
        BigDecimal total = BigDecimal.ZERO;
        for (TransaksiDetail transaksiDetail : daftarBelanja) {
            total = total.add(transaksiDetail.subtotal());
        }
        return total;
    }

    private BigDecimal diskon(){
        BigDecimal totalDiskon = BigDecimal.ZERO;
        System.out.println("Jumlah diskon : "+daftarDiskon.size());
        for(Diskon d : daftarDiskon){
            totalDiskon = totalDiskon.add(d.hitungDiskon(this));
        }
        System.out.println("Total Diskon : "+totalDiskon.setScale(2, RoundingMode.HALF_EVEN));
        return totalDiskon;
    }
}