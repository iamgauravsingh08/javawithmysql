package com.exampleSmallWebApp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.exampleSmallWebApp.UserRegistration;

public interface UserRepo extends JpaRepository<UserRegistration, Long> {
	
	
	@Query("from UserRegistration where lower(UName)=lower(:userName) order by UID desc")
	List<UserRegistration> selectRecordByName(@Param("userName")String name);

}
