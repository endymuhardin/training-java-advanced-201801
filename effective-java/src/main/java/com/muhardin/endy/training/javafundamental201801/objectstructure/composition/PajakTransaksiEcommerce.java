package com.muhardin.endy.training.javafundamental201801.objectstructure.composition;

import java.math.BigDecimal;

// hanya implement interface dan buat implementasi method
// yang relevan saja
public class PajakTransaksiEcommerce implements PajakTransaksi, PajakProduk {

	public BigDecimal pajakProduk(Produk p) {
		return null;
	}

	public BigDecimal pajakTransaksi(Transaksi t) {
		return null;
	}

}