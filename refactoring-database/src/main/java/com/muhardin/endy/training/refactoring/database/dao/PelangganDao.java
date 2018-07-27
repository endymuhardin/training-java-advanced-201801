package com.muhardin.endy.training.refactoring.database.dao;

import com.muhardin.endy.training.refactoring.database.entity.Pelanggan;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface PelangganDao extends PagingAndSortingRepository<Pelanggan, String> {
    
}