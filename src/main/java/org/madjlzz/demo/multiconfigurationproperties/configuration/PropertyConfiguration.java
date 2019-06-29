package org.madjlzz.demo.multiconfigurationproperties.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
public class PropertyConfiguration {

    @Bean
    @ConfigurationProperties(prefix = "property.first")
    public PropertyExample firstProperty() {
        return new PropertyExample();
    }

    @Bean
    @ConfigurationProperties(prefix = "property.second")
    public PropertyExample secondProperty() {
        return new PropertyExample();
    }



}
