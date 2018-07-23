package com.muhardin.endy.training.javafundamental201801.objectstructure;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class TransaksiDetail {
    private Transaksi transaksi;
    private Produk produk;
    private Integer jumlah;

    public BigDecimal subtotal(){
        return produk.getHarga().multiply(new BigDecimal(jumlah));
    }
}