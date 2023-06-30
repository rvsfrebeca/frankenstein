package com.ferreira.rebeca.frankinstain.main.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "jdbc")
public class JdbcProperties {

    private String url;

    private String username;

    private String password;
}
