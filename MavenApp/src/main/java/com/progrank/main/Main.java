package com.progrank.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class Main {
	
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext con = SpringApplication.run(Main.class, args);
		
		Person person = con.getBean(Person.class);
		person.eat();
		
		
		
		/*Person person = con.getBean(Person.class);
		person.eat();*/
		

	}

}