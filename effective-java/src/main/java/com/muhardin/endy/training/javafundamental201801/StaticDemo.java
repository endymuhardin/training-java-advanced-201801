package com.muhardin.endy.training.javafundamental201801;

import lombok.Getter;
import lombok.Setter;

public class StaticDemo {
    public static void main(String[] zz){
        System.out.println(Produk.getJumlahProduk()); // -> 0

        Produk p1 = new Produk();
        p1.setNomorProduk(1);
        p1.setJumlahProduk(5);

        Produk p2 = new Produk();
        p2.setNomorProduk(2);
        p2.setJumlahProduk(8);

        Produk p3 = new Produk();
        
        System.out.println(p1.getNomorProduk()); // -> 1
        System.out.println(p2.getNomorProduk()); // -> 2

        System.out.println(p1.getJumlahProduk()); // -> 5
        System.out.println(p2.getJumlahProduk()); // -> 8
        System.out.println(p3.getJumlahProduk()); // -> 8
    }
}

@Getter @Setter
class Produk {
    private static Integer jumlahProduk = 0;
    private Integer nomorProduk;

    public static void setJumlahProduk(Integer jml){
        jumlahProduk = jml;
    }

    public static Integer getJumlahProduk(){
        return jumlahProduk;
    }

    public void halo(){
        System.out.println("Jumlah Produk : "+jumlahProduk);
    }

    public static void coba(){
        
        // System.out.println("Nomor Produk : "+nomorProduk); // tidak boleh, karena class tidak tahu kondisi instance
    }
}