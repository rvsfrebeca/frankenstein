package com.ferreira.rebeca.frankinstain.people;

import com.ferreira.rebeca.frankinstain.people.adapter.gateway.database.RetrievePeopleImpl;
import com.ferreira.rebeca.frankinstain.people.application.RetrievePeople;
import com.ferreira.rebeca.frankinstain.people.application.RetrievePeopleUseCase;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class PeopleConfiguration {
    @Bean
    public RetrievePeopleUseCase retrievePeopleUseCase(RetrievePeople retrievePeople){
        return new RetrievePeopleUseCase(retrievePeople);
    }

    @Bean
    public RetrievePeople retrievePeople(JdbcTemplate jdbcTemplate){
        return new RetrievePeopleImpl(jdbcTemplate);
    }
}
