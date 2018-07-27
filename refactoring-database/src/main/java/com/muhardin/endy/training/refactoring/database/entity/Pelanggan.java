package com.muhardin.endy.training.refactoring.database.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity @Data @EqualsAndHashCode(of = {"id", "email"})
public class Pelanggan {
    @Id @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @NotEmpty
    private String namaDepan;

    @NotEmpty
    private String namaBelakang;

    @NotEmpty @Email
    private String email;
    
    @NotEmpty
    private String noHp;

}