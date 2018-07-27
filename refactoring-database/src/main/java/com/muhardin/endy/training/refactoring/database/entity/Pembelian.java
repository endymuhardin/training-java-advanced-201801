package com.muhardin.endy.training.refactoring.database.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity @Data
public class Pembelian {
    
    @Id @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    
    @NotNull
    private LocalDateTime waktuTransaksi = LocalDateTime.now();
    
    @NotNull
    @ManyToOne @JoinColumn(name="id_pelanggan")
    private Pelanggan pelanggan;

    @NotNull
    @ManyToOne @JoinColumn(name="id_produk")
    private Produk produk;

    @NotNull @Min(1)
    private Integer jumlah;

    public BigDecimal total(){
        return produk.getHarga().multiply(new BigDecimal(jumlah));
    }
}