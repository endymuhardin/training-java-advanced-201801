package com.muhardin.endy.training.architecture.orthogonality;

import java.io.File;
import java.util.List;

public class DependencyInversionDemo {
    public static void main(String[] args) {
        List<Transaksi> data = ambilData(new DataTransaksiJdbc());

        // radio button CSV
        String strData = transaksiToString(data, new TransaksiExporterCsv());

        // checkbox local file
        simpan(strData, new LocalFileExporter(new File("backup/transaksi.csv")));

        // checkbox S3
        simpan(strData, new S3Exporter("s3://backup/transaksi.csv", "AWSClientId", "AWSClientKey"));
    }

    private static List<Transaksi> ambilData(DataTransaksi dt) {
        return dt.ambilData();
    }

    private static String transaksiToString(List<Transaksi> data, TransaksiExporter exporter){
        return exporter.export(data);
    }

    private static void simpan(String data, DataExporter exporter){
        exporter.export(data);
    }
}