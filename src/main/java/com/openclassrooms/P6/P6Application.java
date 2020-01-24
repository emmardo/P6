package com.openclassrooms.P6;

import com.openclassrooms.P6.Hibernate.UserPersister;
import com.openclassrooms.P6.User.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

@SpringBootApplication
public class P6Application {

	public static void main(String[] args) throws SQLException {

		UserPersister userPersister = new UserPersister();

		User user = userPersister.readUser(1);

		System.out.println(user.getEmail());

		SpringApplication.run(P6Application.class, args);
	}

}
