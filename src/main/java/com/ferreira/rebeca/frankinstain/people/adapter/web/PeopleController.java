package com.ferreira.rebeca.frankinstain.people.adapter.web;

import com.ferreira.rebeca.frankinstain.people.adapter.dto.PeopleDTO;
import com.ferreira.rebeca.frankinstain.people.application.RetrievePeopleUseCase;
import com.ferreira.rebeca.frankinstain.people.application.model.People;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
import java.util.concurrent.Executor;

@RestController
@AllArgsConstructor
public class PeopleController {

    private final RetrievePeopleUseCase retrievePeopleUseCase;

    @GetMapping("/people/{id}")
    public PeopleDTO retrievePeople(@PathVariable UUID id){

        People people = retrievePeopleUseCase.execute(id);

        return PeopleDTO.fromApplication(people);
    }
}
