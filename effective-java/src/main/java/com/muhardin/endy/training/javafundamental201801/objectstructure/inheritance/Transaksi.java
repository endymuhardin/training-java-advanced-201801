package com.muhardin.endy.training.javafundamental201801.objectstructure.inheritance;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import com.muhardin.endy.training.javafundamental201801.objectstructure.TransaksiDetail;

import lombok.Data;

@Data
public class Transaksi {
    private LocalDateTime waktuTransaksi = LocalDateTime.now();

    private Set<TransaksiDetail> daftarBelanja 
        = new HashSet<TransaksiDetail>();

    public BigDecimal total(){
        BigDecimal total = BigDecimal.ZERO;
        for (TransaksiDetail transaksiDetail : daftarBelanja) {
            total = total.add(transaksiDetail.subtotal());
        }
        return total;
    }
}