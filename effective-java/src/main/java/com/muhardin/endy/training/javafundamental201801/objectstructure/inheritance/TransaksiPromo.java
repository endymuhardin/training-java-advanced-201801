package com.muhardin.endy.training.javafundamental201801.objectstructure.inheritance;

import java.math.BigDecimal;

import com.muhardin.endy.training.javafundamental201801.objectstructure.Transaksi;

import lombok.Data;

@Data
public abstract class TransaksiPromo extends Transaksi {
    private String namaPromo;

    public abstract BigDecimal hitungDiskon();
}