package com.vinyle.collection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class CollectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollectionApplication.class, args);
	}

}
