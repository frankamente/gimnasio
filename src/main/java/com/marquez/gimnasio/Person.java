package com.marquez.gimnasio;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

class Person {

    @JsonProperty("name")
    private final String name;
    @JsonProperty("lastName")
    private final String lastName;

    @JsonCreator
    Person(@JsonProperty("name") final String name,
           @JsonProperty("lastName") final String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    String getName() {
        return name;
    }

    String getLastName() {
        return lastName;
    }
}
