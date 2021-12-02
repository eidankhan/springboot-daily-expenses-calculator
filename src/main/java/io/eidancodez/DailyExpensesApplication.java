package io.eidancodez;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DailyExpensesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DailyExpensesApplication.class, args);
		System.out.println("App started successfully...!");
	}

}
