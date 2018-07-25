package com.muhardin.endy.training.designpatterns.builder;

import java.time.LocalDate;

public class CustomerTelescopic {
    private String name;
    private String email;
    private String address;
    private LocalDate birthdate;

    // telescopic constructor
    
    // mulai dari field yang mandatory
    public CustomerTelescopic(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // kalau mau tambah address
    public CustomerTelescopic(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }

    // kalau mau yang lengkap
    public CustomerTelescopic(String name, String email, String address, LocalDate birthdate) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.birthdate = birthdate;
    }
    
    
}
