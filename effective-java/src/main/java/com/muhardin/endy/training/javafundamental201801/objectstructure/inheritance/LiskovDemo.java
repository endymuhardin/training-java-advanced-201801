package com.muhardin.endy.training.javafundamental201801.objectstructure.inheritance;

public class LiskovDemo {
    public static void main(String[] args) {
        Kotak k = new Kotak();
        proses(k);

        BujurSangkar bs = new BujurSangkar();
        bs.setPanjang(10);
        proses(bs);

        System.out.print("Luas : "+bs.luas());
    }

    public static void proses(Kotak k){
        k.setPanjang(10);
        k.setLebar(20);
        System.out.println("Luas : "+k.luas());
        System.out.println("Luas : "+k.getPanjang());
        System.out.println("Luas : "+k.getLebar());
    }
}