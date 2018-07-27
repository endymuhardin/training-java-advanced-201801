package com.muhardin.endy.training.refactoring.database.helper;

import com.muhardin.endy.training.refactoring.database.entity.Pelanggan;

// harusnya dihapus karena sudah tidak dibutuhkan
public abstract class PemisahNama {

    /*
    public static void pisahNama(Pelanggan p){
        String nama = p.getNama();
        int spasiPertama = nama.indexOf(' ');
        String namaDepan = nama.substring(0, spasiPertama);
        String namaBelakang = nama.substring(spasiPertama).trim();

        p.setNamaDepan(namaDepan);
        p.setNamaBelakang(namaBelakang);
    }
    */
}