package com.muhardin.endy.training.designpatterns.factory;

public class DiskonFactory {

    public static Diskon tentukanDiskon(Transaksi t){
        // kalau tanggal libur, keluarkan DiskonHariRaya
        // kalau ada produk tertentu, keluarkan DiskonProduk
        return new DiskonHariRaya();
    }
}