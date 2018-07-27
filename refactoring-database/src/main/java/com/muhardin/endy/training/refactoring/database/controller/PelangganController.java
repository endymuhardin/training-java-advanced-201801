package com.muhardin.endy.training.refactoring.database.controller;

import com.muhardin.endy.training.refactoring.database.dao.PelangganDao;
import com.muhardin.endy.training.refactoring.database.entity.Pelanggan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
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
}