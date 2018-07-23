package com.muhardin.endy.training.javafundamental201801.objectstructure.interfaceabstract;

public class InterfaceAbstractDemo {
    public static void main(String[] args) {
        PenyimpananData storage = new PenyimpananDiFile();
        storage.simpan("Hello World");

        DataExporter exporter = new CsvDataExporter();
        exporter.execute();
    }
}