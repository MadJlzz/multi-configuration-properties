package org.madjlzz.demo.multiconfigurationproperties;

import org.madjlzz.demo.multiconfigurationproperties.configuration.PropertyExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

@Component
public class Runner implements CommandLineRunner {

    private PropertyExample firstProperty;

    private PropertyExample secondProperty;

    @Autowired
    public Runner(/*@Validated*/ /*@Valid*/ final PropertyExample firstProperty,
            /*@Validated*/ /*@Valid*/ PropertyExample secondProperty) {
        this.firstProperty = firstProperty;
        this.secondProperty = secondProperty;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(firstProperty);
        System.out.println(secondProperty);
    }

}
