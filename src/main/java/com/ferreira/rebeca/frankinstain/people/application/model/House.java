package com.ferreira.rebeca.frankinstain.people.application.model;

import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Builder
@Getter
public class House {
    private final UUID id;
    private final String street;
    private final int number;
}
