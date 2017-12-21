package com.example.groovycompilefailure;

import com.example.groovycompilefailure.groovycompilefailure.CatBuilder;
import com.example.groovycompilefailure.groovycompilefailure.DogBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GroovyCompileFailureApplication {

	public static void main(String[] args) {
		SpringApplication.run(GroovyCompileFailureApplication.class, args);

		System.out.println(new DogBuilder().name("dog").getAnimal());
		System.out.println(new CatBuilder().name("cat").getAnimal());
	}


}
