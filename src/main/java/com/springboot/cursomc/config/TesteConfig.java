package com.springboot.cursomc.config;

import com.springboot.cursomc.services.DBsevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.text.ParseException;

@Configuration
@Profile("test")
public class TesteConfig {

    @Autowired
    private DBsevice dBsevice;

    @Bean
    public boolean instantiateDatabase() throws ParseException {
        dBsevice.instantiateTesteDatabase();
        return true;
    }

}
