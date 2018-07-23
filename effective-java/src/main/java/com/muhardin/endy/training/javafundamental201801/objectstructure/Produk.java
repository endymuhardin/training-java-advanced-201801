package com.muhardin.endy.training.javafundamental201801.objectstructure;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class Produk{
    private String kode;
    private String nama;
    private BigDecimal harga;
}