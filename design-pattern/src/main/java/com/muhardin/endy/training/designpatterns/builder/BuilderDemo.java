package com.muhardin.endy.training.designpatterns.builder;

import java.time.LocalDate;

public class BuilderDemo {
    public static void main(String[] args) {
        
        // hanya menggunakan setter, tidak bisa menentukan mandatory field
        CustomerPlain cp = new CustomerPlain();
        cp.setName("Endy");
        cp.setAddress("Bogor");
        
        // pakai telescopic constructor
        // bisa menentukan mandatory field, tapi masih rawan tertukar urutan
        CustomerTelescopic ct = new CustomerTelescopic("endy@muhardin.com", "Bogor", "Endy");
        
        // pakai builder .. oke
        CustomerWithBuilder cb = CustomerWithBuilder.builder()
                //.name("Endy") // kalau ini tidak diset, harusnya error
                .email("endy@muhardin.com")
                .address("Bogor")
                .birthdate(LocalDate.now())
                .build();
    }
}
