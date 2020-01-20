package com.openclassrooms.P6;

import com.mysql.jdbc.Connection;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.DriverManager;

@SpringBootApplication
public class P6Application {

	public static void main(String[] args) {

		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root", "Programartodo1!");
			System.out.print("Database is connected !");
			conn.close();
		}
		catch(Exception e)
		{
			System.out.print("Do not connect to DB - Error:"+e);
		}

		SpringApplication.run(P6Application.class, args);
	}

}
