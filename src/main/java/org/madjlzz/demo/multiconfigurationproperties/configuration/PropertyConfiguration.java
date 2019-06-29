package org.madjlzz.demo.multiconfigurationproperties.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

@Configuration
@EnableConfigurationProperties
public class PropertyConfiguration {

    @Bean
    @Validated
    @ConfigurationProperties(prefix = "property.first")
    public PropertyExample firstProperty() {
        return new PropertyExample();
    }

    @Bean
    // Do not get fooled by this. It seems the validation is made on the class level and it doesn't
    // take in account the @ConfigurationProperties.
    // That means that even if this bean is not annotated, it will be validated too.
    //@Validated
    @ConfigurationProperties(prefix = "property.second")
    public PropertyExample secondProperty() {
        return new PropertyExample();
    }



}
