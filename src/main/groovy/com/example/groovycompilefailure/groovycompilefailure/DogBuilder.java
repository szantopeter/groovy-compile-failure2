package com.example.groovycompilefailure.groovycompilefailure;

import com.example.groovycompilefailure.domain.Dog;

public class DogBuilder extends AnimalBuilder<Dog> {

    public DogBuilder() {
        super(new Dog());
    }

}
