package com.muhardin.endy.training.javafundamental201801.objectstructure.composition;

import java.math.BigDecimal;

// ini kurang baik
// melanggar prinsip Interface Segregation
public class PajakTransaksiOnline implements Pajak {

	public BigDecimal pajakNilaiTransaksi(Transaksi transaksi) {
		return null;
	}

	public BigDecimal pajakJenisProduk(Produk produk) {
		return null;
	}

    // ada method yang tidak relevan, tapi terpaksa dibuat
    // karena ada di interface Pajak
	public BigDecimal pajakPembeli(String pembeli) {
		throws new UnsupportedOperationException("transaksi online tidak ada pajak pembeli");
	}

}