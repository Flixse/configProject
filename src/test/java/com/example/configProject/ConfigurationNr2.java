package com.example.configProject;

import com.example.configProject.config.GlobalConfiguration;
import com.example.configProject.config.MultipleConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * Created by Felix Porres on 18/12/2018.
 */
@Configuration
public class ConfigurationNr2 {

    @Primary
    @Bean
    @ConfigurationProperties(value= "prefixtwo")
    GlobalConfiguration config(){
        return new GlobalConfiguration();
    }

}
