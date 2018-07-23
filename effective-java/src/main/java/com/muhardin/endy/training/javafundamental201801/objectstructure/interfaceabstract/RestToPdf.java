package com.muhardin.endy.training.javafundamental201801.objectstructure.interfaceabstract;

public class RestToPdf extends DataExporter {

    @Override
    public void ambilData() {
        System.out.println("Ambil data dari REST API");
    }

	@Override
	public void exportData() {
		System.out.println("Export data ke PDF");
	}

}