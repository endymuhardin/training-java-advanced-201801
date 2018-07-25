package com.muhardin.endy.training.javafundamental201801.metaprogramming;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ReflectionDemo {
    public static void main(String[] args) throws Exception {
        String namaClass = "com.muhardin.endy.training.javafundamental201801.objectstructure.interfaceabstract.DataExporter";

        Class kelas = Class.forName(namaClass);
        Method[] daftarMethod = kelas.getMethods();
        for(Method m : daftarMethod){
            System.out.println("Nama method : "+m.getName());
            System.out.println("==== Argumen =====");
            for(Parameter p : m.getParameters()){
                System.out.println("Nama Parameter : "+p.getName());
                System.out.println("Tipe Data : "+p.getType().getName());
            }
            System.out.println("==== Argumen =====");
            System.out.println("Tipe data return value : "+m.getReturnType().getName());
        }
    }
}