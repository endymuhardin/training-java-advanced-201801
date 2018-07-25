package com.muhardin.endy.training.designpatterns.singleton;

public class SingletonDemo {
    public static void main(String[] xx){
        // tidak bisa diinstankan langsung
        // karena constructor dibuat private
        // KoneksiBiller k = new KoneksiBiller("192.168.1.100", 3000);

        // mendapatkan instance KoneksiBiller
        // harus melalui static getter
        KoneksiBiller k1 = KoneksiBiller.getKoneksiBiller("192.168.0.1", 3000);
        System.out.println("Alamat IP k1 : "+k1.getAlamatIp());

        // pemanggilan kedua, hasilnya tetap objek yang sama dengan k1
        KoneksiBiller k2 = KoneksiBiller.getKoneksiBiller("192.168.0.2", 3000);
        System.out.println("Alamat IP k2 : "+k2.getAlamatIp());

        System.out.println("k1 == k2 : "+(k1 == k2));
    }
}