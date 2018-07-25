package com.muhardin.endy.training.designpatterns.builder;

import java.time.LocalDate;

public class CustomerPlain {
    private String name;
    private String email;
    private String address;
    private LocalDate birthdate;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }
    
    
}
