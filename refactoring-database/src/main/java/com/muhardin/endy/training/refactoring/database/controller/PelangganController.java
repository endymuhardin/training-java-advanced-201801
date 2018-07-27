package com.muhardin.endy.training.refactoring.database.controller;

import javax.validation.Valid;

import com.muhardin.endy.training.refactoring.database.dao.PelangganDao;
import com.muhardin.endy.training.refactoring.database.entity.Pelanggan;
import com.muhardin.endy.training.refactoring.database.helper.PemisahNama;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pelanggan")
public class PelangganController {
    @Autowired private PelangganDao pelangganDao;

    @GetMapping("/")
    public Page<Pelanggan> findPelanggan(Pageable page){
        return pelangganDao.findAll(page);
    }

    @PostMapping("/")
    public void simpan(@RequestBody @Valid Pelanggan p){
        PemisahNama.pisahNama(p); // kalau mau live sebelum kolom nama dihapus
        pelangganDao.save(p);
    }
}