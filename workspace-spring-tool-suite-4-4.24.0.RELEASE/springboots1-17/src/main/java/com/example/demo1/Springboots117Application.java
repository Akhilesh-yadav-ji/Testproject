package com.example.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Springboots117Application {

	public static void main(String[] args) {
		SpringApplication.run(Springboots117Application.class, args);
	 System.out.println("hello Akhilesh");
	 
	 ConfigurableApplicationContext context = SpringApplication.run(Springboots117Application.class, args);
			 student s=context.getBean(student.class);
	   s.disp();
	}

}