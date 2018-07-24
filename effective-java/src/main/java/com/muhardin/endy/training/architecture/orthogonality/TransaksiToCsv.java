package com.muhardin.endy.training.architecture.orthogonality;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;

public class TransaksiToCsv {
    String jdbcUrl = "";
    String jdbcUsername = "";
    String jdbcPassword = "";

    private Connection connection;

    public void proses(){
        connectDb();
        ResultSet rs = query("select * from transaksi");
        List<Transaksi> hasil = rsKeTransaksi(rs);
        exportCsv(hasil, "/tmp/transaksi.csv");
    }

    private void connectDb(){

    }

    private ResultSet query(String sql){
        return null;
    }

    private List<Transaksi> rsKeTransaksi(ResultSet rs){
        return null;
    }

    private void exportCsv(List<Transaksi> data, String fileTujuan){

    }
}