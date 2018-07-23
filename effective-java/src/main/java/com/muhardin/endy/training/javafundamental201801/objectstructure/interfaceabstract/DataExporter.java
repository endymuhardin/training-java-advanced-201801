package com.muhardin.endy.training.javafundamental201801.objectstructure.interfaceabstract;

import lombok.Data;

@Data
public abstract class DataExporter {
    // optional, boleh pakai default, boleh implement ulang
    public void ambilData(){
        System.out.println("select * from produk");
    }

    // wajib implement detailnya
    public abstract void exportData();

    // tidak boleh diganti, urutan harus seperti ini
    public final void execute(){
        ambilData();
        exportData();
    }
}