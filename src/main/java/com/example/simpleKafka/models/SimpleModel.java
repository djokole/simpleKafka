package com.example.simpleKafka.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class SimpleModel {

    @Getter @Setter private String field1;
    @Getter @Setter private String field2;

    @Override
    public String toString() {
        return field1 + " " + field2;
    }
}
