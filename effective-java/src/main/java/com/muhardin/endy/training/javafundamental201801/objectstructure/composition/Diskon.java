package com.muhardin.endy.training.javafundamental201801.objectstructure.composition;

import java.math.BigDecimal;


import lombok.Data;

@Data
public abstract class Diskon {
    private String nama;
    public abstract BigDecimal hitungDiskon(Transaksi t);
}