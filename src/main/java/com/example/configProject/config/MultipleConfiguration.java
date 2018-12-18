package com.example.configProject.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Felix Porres on 18/12/2018.
 */
@Configuration
@EnableConfigurationProperties
@ConfigurationProperties
public class MultipleConfiguration {

    @Bean(name = "confBeanOfFelix")
    @ConfigurationProperties(prefix = "prefixone")
    GlobalConfiguration config(){
        return new GlobalConfiguration();
    }
}
