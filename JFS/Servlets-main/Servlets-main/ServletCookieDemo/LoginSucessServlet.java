package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginSucess")
public class LoginSucessServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = null;
		
		Cookie[] cookies = request.getCookies();
		
		for (Cookie c : cookies) {
			if(c.getName().equals("username")) {
				username = c.getValue();
				PrintWriter out = response.getWriter();
				out.print("Hi " + username + " Logged in Sucessfully");
			}
		}
		
		
		
	}

}
