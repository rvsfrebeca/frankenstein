package com.ferreira.rebeca.frankinstain.people.application;

import com.ferreira.rebeca.frankinstain.people.application.model.People;
import com.ferreira.rebeca.frankinstain.people.exception.RetrievePeopleException;

import java.util.UUID;

public class RetrievePeopleUseCase {
    private RetrievePeople retrievePeople;

    public RetrievePeopleUseCase(RetrievePeople retrievePeople) {
        this.retrievePeople = retrievePeople;
    }

    public People execute(UUID id){
        try {
            People people = retrievePeople.by(id);
            if (people == null){
                throw new RetrievePeopleException("People not found");
            }
            return people;
        } catch (Exception error){
            throw new RetrievePeopleException("People not found");
        }

    }
}
