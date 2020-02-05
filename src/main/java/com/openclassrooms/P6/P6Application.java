package com.openclassrooms.P6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.sql.SQLException;

@SpringBootApplication

//Need to remove annotation beneath
@EnableJpaAuditing
public class P6Application {

	public static void main(String[] args) throws SQLException {
		SpringApplication.run(P6Application.class, args);
	}

}
