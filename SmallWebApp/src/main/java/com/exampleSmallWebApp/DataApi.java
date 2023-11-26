package com.exampleSmallWebApp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exampleSmallWebApp.dao.UserRepo;


@RestController
public class DataApi {
	
	@Autowired
	UserRepo repo;
	

	@RequestMapping("/getUserAllDetails")
	public List<UserRegistration> getAllData() {
		return repo.findAll(); 
	}
	
	@RequestMapping("/getUserByID/{uid}")
	public Optional<UserRegistration> getRecordByID(@PathVariable("uid") Long Id) {
		return repo.findById(Id); 
	}

}
