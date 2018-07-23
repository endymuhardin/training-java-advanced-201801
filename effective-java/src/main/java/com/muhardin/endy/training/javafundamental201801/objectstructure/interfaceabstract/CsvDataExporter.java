package com.muhardin.endy.training.javafundamental201801.objectstructure.interfaceabstract;

public class CsvDataExporter extends DataExporter {

	@Override
	public void exportData() {
        System.out.println("id,kode,nama");
        System.out.println("1,P-001,Produk 001");
    }
    
    /* tidak boleh override, karena sudah final di superclass
    public void execute(){
        exportData();
        super.ambilData();
    }
    */
}