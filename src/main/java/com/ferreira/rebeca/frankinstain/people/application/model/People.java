package com.ferreira.rebeca.frankinstain.people.application.model;

import lombok.Builder;
import lombok.Getter;

import java.util.List;
import java.util.UUID;

@Builder
@Getter
public class People {
    private final UUID id;
    private final String name;
    private final int age;
    private final House house;
}
