package com.muhardin.endy.training.architecture.orthogonality;

import java.io.File;

public class LocalFileExporter implements DataExporter {
    private File tujuan;
    public LocalFileExporter(File tujuan){
        this.tujuan = tujuan;
    }
	public void export(String data) {
		// tulis data ke file tujuan
	}

}