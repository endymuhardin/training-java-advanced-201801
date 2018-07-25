package com.muhardin.endy.training.designpatterns.singleton;

import lombok.Getter;

@Getter
public class KoneksiBiller {
    private String alamatIp;
    private Integer port;

    private static KoneksiBiller k;

    public static KoneksiBiller getKoneksiBiller(String ip, Integer port){
        if(k == null){
            k = new KoneksiBiller(ip, port);
        }
        return k;
    }

    private KoneksiBiller(String ip, Integer port){
        this.alamatIp = ip;
        this.port = port;
    }
}