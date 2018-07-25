package com.muhardin.endy.training.designpatterns.factory;

import java.math.BigDecimal;

public interface Diskon {
    public BigDecimal hitungDiskon(Transaksi t);
}