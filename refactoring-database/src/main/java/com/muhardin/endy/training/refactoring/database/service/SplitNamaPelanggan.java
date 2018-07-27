package com.muhardin.endy.training.refactoring.database.service;

import javax.annotation.PostConstruct;

import com.muhardin.endy.training.refactoring.database.dao.PelangganDao;
import com.muhardin.endy.training.refactoring.database.helper.PemisahNama;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.GitProperties;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SplitNamaPelanggan {

    private static final String APPLICABLE_TAG = "1.3.0";

    @Autowired private GitProperties git;
    @Autowired private PelangganDao pelangganDao;

    @PostConstruct
    public void splitNamaDepanBelakang(){
        String gitTag = git.get("closest.tag.name");
        if (gitTag != null && gitTag.startsWith(APPLICABLE_TAG)) {
            pelangganDao.findAll().forEach(p -> {
                PemisahNama.pisahNama(p);
                pelangganDao.save(p);
            });
        }
    }
}