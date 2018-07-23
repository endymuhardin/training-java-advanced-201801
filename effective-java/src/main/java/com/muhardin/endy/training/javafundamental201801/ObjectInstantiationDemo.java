package com.muhardin.endy.training.javafundamental201801;

import java.io.BufferedReader;
import java.io.StringReader;

import lombok.Getter;
import lombok.Setter;

public class ObjectInstantiationDemo {
    public void prosesCsv(String csv) throws Exception {
        BufferedReader reader = new BufferedReader(new StringReader(csv));
        String baris;

        // premature optimization
        String e;

        while((baris = reader.readLine()) != null) {
            String[] data = baris.split(",");
            e = data[0];
            String p = data[1];
            
            User x = new User();
            x.setEmail(e);
            x.setPassword(p);
        }

        // 100 baris selanjutnya, variabel e masih hidup
        // variabel p dan x sudah dimakan GC
    }

    public static void main(String[] args) {
        Product p = new Product();
        p.setCode("P-001");
        p.setName("Product 001");

        System.out.println(p);
    }
}

@Setter @Getter
class User {
    private String email;
    private String password;
}