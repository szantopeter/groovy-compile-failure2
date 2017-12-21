package com.example.groovycompilefailure.groovycompilefailure;

import com.example.groovycompilefailure.domain.Cat;

public class CatBuilder extends AnimalBuilder<Cat> {

    public CatBuilder() {
        super(new Cat());
    }

}
