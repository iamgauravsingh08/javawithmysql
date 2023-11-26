package com.selinum;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("numb1"));
		int j = Integer.parseInt(req.getParameter("numb2"));
		
		int k = i + j;
		
	//	Cookie cookie =new Cookie("k", k + "");
	//	res.addCookie(cookie);
		
	//	res.sendRedirect("sq?k="+k);    //URL Rewriting
		
		
		
		//RequestDispatcher rd = req.getRequestDispatcher("sq");
		//rd.forward(req, res);
		
		PrintWriter out = res.getWriter();
		out.println("<html><body bgcolor='Green'>");
		out.println("Output : " + k);
		out.println("</body></html>");
		
	}

}
