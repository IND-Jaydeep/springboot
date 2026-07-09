package com.spring_tutorials.production_ready_features.configs;


import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigs {

    @Bean
    ModelMapper getModelMapper(){
        return new ModelMapper();
    }
}
