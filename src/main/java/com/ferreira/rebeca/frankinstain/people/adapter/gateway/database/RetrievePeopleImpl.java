package com.ferreira.rebeca.frankinstain.people.adapter.gateway.database;

import com.ferreira.rebeca.frankinstain.people.application.RetrievePeople;
import com.ferreira.rebeca.frankinstain.people.application.model.House;
import com.ferreira.rebeca.frankinstain.people.application.model.People;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;
@AllArgsConstructor
public class RetrievePeopleImpl implements RetrievePeople {
    private final String QUERY_BY_ID = "SELECT people.id, name, age, house_id, street, number FROM people INNER JOIN house ON people.house_id = house.id WHERE people.id = ?;";

    private final JdbcTemplate jdbcTemplate;

    @Override
    public People by(UUID id) {
        try {
            return jdbcTemplate.query(QUERY_BY_ID, this::mapRowToPeople, id);
        } catch (RuntimeException error){
            throw error;
        }

    }

    private People mapRowToPeople(ResultSet resultSet) throws SQLException {
        try {

            if(resultSet.next()){
                return People.builder()
                        .id(resultSet.getObject("id", UUID.class))
                        .name(resultSet.getString("name"))
                        .age(resultSet.getInt("age"))
                        .house(House.builder()
                                .id(resultSet.getObject("house_id", UUID.class))
                                .street(resultSet.getString("street"))
                                .number(resultSet.getInt("number"))
                                .build())
                        .build();
            }

        } catch (SQLException error){
            throw error;
        }

        return null;
    }
}
