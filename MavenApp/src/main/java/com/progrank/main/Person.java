package com.progrank.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	@Autowired
	Food food;
	
	public void speak() {
		System.out.println("i can able to speak !!");
	}
    
	public void eat() {
		food.recipes();
	}
}
