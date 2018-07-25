package com.muhardin.endy.training.javafundamental201801.objectstructure.composition;

import java.math.BigDecimal;

// kurang baik, melanggar prinsip Interface Segregation
// mungkin nanti ada method yang tidak relevan diimplement subclass
public interface Pajak {
    public BigDecimal pajakNilaiTransaksi(Transaksi transaksi);
    public BigDecimal pajakJenisProduk(Produk produk);
    public BigDecimal pajakPembeli(String pembeli);
}