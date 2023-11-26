package com.exampleMyFirstBootApp;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	

	@RequestMapping("/result")
	public ModelAndView index(@RequestParam("val") String data) {
		/*
		Map<String, String> map = new HashMap<String , String >();
		map.put("value", data);	
		*/
		ModelAndView mv = new ModelAndView();
		mv.addObject("value", data);
		return mv;
		//return "result";
	}
	
	/*
	@RequestMapping("/result")
	public String index(HttpServletRequest request) {
		//System.out.println("Value : "+request.getParameter("data"));
		HttpSession session = request.getSession();
		session.setAttribute("value", request.getParameter("data"));
		return "result";
	}
	*/

}
