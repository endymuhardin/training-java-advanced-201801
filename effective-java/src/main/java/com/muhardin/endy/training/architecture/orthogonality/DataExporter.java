package com.muhardin.endy.training.architecture.orthogonality;

public interface DataExporter {
    public void export(String data);
    
    /* BAD : 
    * - melanggar single responsibility, satu class banyak fungsi
    * - melanggar interface segregation, ada method yang belum tentu bisa diimplement di subclass
    * - melanggar dependency inversion, harusnya tujuan penyimpanan diabstraksi menjadi detail implementasi saja
    public void export(String data, File tujuan);
    public void export(String data, String s3url);
    */
}