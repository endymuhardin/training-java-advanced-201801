package com.muhardin.endy.training.refactoring.database.service;

import javax.annotation.PostConstruct;

import com.github.javafaker.Faker;
import com.muhardin.endy.training.refactoring.database.dao.PelangganDao;
import com.muhardin.endy.training.refactoring.database.entity.Pelanggan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.GitProperties;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SampleDataService {

    private static final String APPLICABLE_TAG = "1.1.0";

    @Autowired private GitProperties git;
    @Autowired private PelangganDao pelangganDao;
    private Integer jumlahData = 100;

    @PostConstruct
    public void insertSampleData() {
        String gitTag = git.get("closest.tag.name");
        if (gitTag != null && gitTag.startsWith(APPLICABLE_TAG)) {
            for (int i = 0; i < jumlahData; i++) {
                Faker faker = new Faker();
                Pelanggan p = new Pelanggan();
                // p.setNama(faker.name().fullName()); // field nama dihapus
                p.setNamaDepan(faker.name().firstName());
                p.setNamaBelakang(faker.name().lastName());
                p.setEmail(faker.name().username() + "@" + faker.internet().domainName());
                p.setNoHp(faker.phoneNumber().cellPhone());
                pelangganDao.save(p);
            }
        }
    }
}