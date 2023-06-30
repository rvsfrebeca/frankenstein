package com.ferreira.rebeca.frankinstain.people.adapter.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Builder
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HouseDTO {
    private final UUID id;
    private final String street;
    private final int number;
}
