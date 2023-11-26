package com.exampleSmallWebApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.exampleSmallWebApp.dao.UserRepo;

@Controller
public class RegistrationController {
	
	@Autowired
	UserRepo repo;
	
	@RequestMapping("/regform")
	public String register() {
		return "registration";
	}
	
	/*
	@RequestMapping("/userDetail")
	public ModelAndView userInfo(UserRegistration reg) {
		
		ModelMap model = new ModelMap();
		model.addAttribute("name", reg.getUName());
		model.addAttribute("email", reg.getEmailId());
		model.addAttribute("gender", reg.getGender() == Integer.parseInt("1") ? "Male" : "Female");
		model.addAttribute("hobbies", reg.getHobby());
		
		ModelAndView mv = new ModelAndView("user-details");
		mv.addObject("regObj" ,model);		
		return mv;
		
	}
	*/
	
	@RequestMapping("/userDetail")
	public String userInfo(UserRegistration reg) {
		repo.save(reg);
		return "operation";
	}
	
	
	@RequestMapping("/operation")
	public ModelAndView  operation(Long UId, String ddlFlag) {
		if (ddlFlag.equals("select")) {
			
			UserRegistration reg = repo.findById(UId).orElse(new UserRegistration());
			return selectRecords(reg);
			
			}else if (ddlFlag.equals("delete")) {
				repo.deleteById(UId);
			}else if (ddlFlag.equals("update")) {
				UserRegistration reg = repo.findById(UId).orElse(new UserRegistration());
				reg.setUName("Raju updated_name");
				repo.save(reg);
				}else {
					System.out.println(repo.selectRecordByName("sneha"));
			    }
		
		return new ModelAndView("operation");
	}
	
	public ModelAndView selectRecords(UserRegistration reg){
		
		
		ModelMap model = new ModelMap();
		model.put("name", reg.getUName());
		model.put("email", reg.getEmailId());
		model.put("gender", reg.getGender() == Integer.parseInt("1") ? "Male" : "Female");
		
		
		ModelAndView mv = new ModelAndView("user-details");
		mv.addObject("regObj" ,model);		
		return mv;
	}

}
