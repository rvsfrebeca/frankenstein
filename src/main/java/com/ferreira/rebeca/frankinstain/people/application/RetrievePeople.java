package com.ferreira.rebeca.frankinstain.people.application;

import com.ferreira.rebeca.frankinstain.people.application.model.People;

import java.util.UUID;

public interface RetrievePeople {
    People by(UUID id);

}
