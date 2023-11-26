package com.exampleSmallWebApp;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_reg")
public class UserRegistration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long UID;
	private String UName;
	private String EmailId;
	private String Password;
	private byte Gender;
	private String[] Hobby;
	public String getUName() {
		return UName;
	}
	public void setUName(String uName) {
		UName = uName;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public byte getGender() {
		return Gender;
	}
	public void setGender(byte gender) {
		Gender = gender;
	}
	public String[] getHobby() {
		return Hobby;
	}
	public void setHobby(String[] hobby) {
		Hobby = hobby;
	}
	@Override
	public String toString() {
		return "UserRegistration [UName=" + UName + ", EmailId=" + EmailId + ", Password=" + Password + ", Gender="
				+ Gender + ", Hobby=" + Arrays.toString(Hobby) + "]";
	}






}
