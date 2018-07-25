package com.muhardin.endy.training.designpatterns.factory;

public class FactoryDemo {
    public static void main(String[] args) {
        // cara tradisional
        // nama class dihardcode
        // Diskon d = new DiskonHariRaya();

        // pakai factory, client code tidak tau detail pembuatan 
        // dan proses inisialisasi diskon
        Diskon d = DiskonFactory.tentukanDiskon(new Transaksi());


    }
}