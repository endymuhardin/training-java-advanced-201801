package com.muhardin.endy.training.javafundamental201801.objectstructure.inheritance;

import lombok.Data;

@Data
public class Kotak {
    private Integer panjang;
    private Integer lebar;

    public Integer luas(){
        return panjang * lebar;
    }
}