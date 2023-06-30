package com.ferreira.rebeca.frankinstain.people.adapter.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.ferreira.rebeca.frankinstain.people.application.model.People;
import lombok.Builder;
import lombok.Getter;

import java.util.List;
import java.util.UUID;

@Builder
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PeopleDTO {

    private final UUID id;
    private final String name;
    private final int age;
    private final HouseDTO house;

    public static PeopleDTO fromApplication(People people){
        return PeopleDTO.builder()
                .age(people.getAge())
                .name(people.getName())
                .house(HouseDTO.builder()
                        .street(people.getHouse().getStreet())
                        .number(people.getHouse().getNumber())
                        .build())
                .build();
    }



}
