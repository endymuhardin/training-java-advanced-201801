package com.muhardin.endy.training.javafundamental201801.objectstructure.composition;

import java.math.BigDecimal;

import com.muhardin.endy.training.javafundamental201801.objectstructure.Produk;
import com.muhardin.endy.training.javafundamental201801.objectstructure.TransaksiDetail;

public class CompositionDemo {
    public static void main(String[] args) {
        // Data awal
        Produk p1 = new Produk();
        p1.setKode("P-001");
        p1.setNama("Produk 001");
        p1.setHarga(new BigDecimal(100000));

        Produk p2 = new Produk();
        p2.setKode("P-002");
        p2.setNama("Produk 002");
        p2.setHarga(new BigDecimal(200000));

        Produk p3 = new Produk();
        p3.setKode("P-003");
        p3.setNama("Produk 003");
        p3.setHarga(new BigDecimal(300000));

        Transaksi normal = new Transaksi();
        TransaksiDetail td1 = new TransaksiDetail();
        td1.setJumlah(2);
        td1.setProduk(p1);
        normal.getDaftarBelanja().add(td1);
        System.out.println("Total transaksi normal : "+normal.tagihan());

        Transaksi diskon = new Transaksi();
        TransaksiDetail td2 = new TransaksiDetail();
        td2.setJumlah(2);
        td2.setProduk(p1);
        diskon.getDaftarBelanja().add(td2);
        
        Diskon lebaran = new DiskonHariRaya("Lebaran");
        diskon.getDaftarDiskon().add(lebaran);
        
        System.out.println("Total transaksi diskon : "+diskon.tagihan());

    }
}