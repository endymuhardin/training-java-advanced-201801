package com.muhardin.endy.training.javafundamental201801.objectstructure.inheritance;

import lombok.Data;

@Data
public class BujurSangkar extends Kotak {
    @Override
    public void setLebar(Integer x){
        setSisi(x);
    }

    @Override
    public void setPanjang(Integer x){
        setSisi(x);
    }

    private void setSisi(Integer x){
        super.setLebar(x);
        super.setPanjang(x);
    }
}