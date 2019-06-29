package org.madjlzz.demo.multiconfigurationproperties.configuration;

import lombok.Setter;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Setter
@ToString
//@Valid
@Validated
public class PropertyExample {

    @NotBlank
    private String name;

    @NotBlank
    private String firstname;

    @Min(value = 18)
    private int age;

}
