package com.muhardin.endy.training.designpatterns.builder;

import java.time.LocalDate;
import lombok.Builder;
import lombok.NonNull;

@Builder
public class CustomerWithBuilder {
    @NonNull
    private String name;
    @NonNull
    private String email;
    private String address;
    private LocalDate birthdate;
    
}
