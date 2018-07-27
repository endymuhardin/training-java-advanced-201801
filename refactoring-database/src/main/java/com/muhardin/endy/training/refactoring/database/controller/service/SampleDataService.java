package com.muhardin.endy.training.refactoring.database.service;

import javax.annotation.PostConstruct;

import com.github.javafaker.Faker;
import com.muhardin.endy.training.refactoring.database.dao.PelangganDao;
import com.muhardin.endy.training.refactoring.database.entity.Pelanggan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service @Transactional
@Profile("1.1.0") // SPRING_PROFILES_ACTIVE=1.1.0 mvn clean spring-boot:run
public class SampleDataService {

    @Autowired private PelangganDao pelangganDao;
    private Integer jumlahData = 100;

    @PostConstruct
    public void insertSampleData(){
        for(int i = 0; i<jumlahData; i++){
            Faker faker = new Faker();
            Pelanggan p = new Pelanggan();
            p.setNama(faker.name().fullName());
            p.setEmail(faker.name().username()+"@"+faker.internet().domainName());
            p.setNoHp(faker.phoneNumber().cellPhone());
            pelangganDao.save(p);
        }
    }
}