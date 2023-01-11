package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//1. get the values that entered in the login form 
		//username and password
		String enteredUsername = request.getParameter("username"); //value of our name attribute <input type = "text" name= "username">
		String enteredPassword = request.getParameter("password"); 
		
		if(enteredPassword.equals("admin")) {
			System.out.println("logged in!!");
			// create a cookie
			Cookie usernameCookie = new Cookie("username", enteredUsername);
			//expiration time
			usernameCookie.setMaxAge(60);//seconds
			
			response.addCookie(usernameCookie);
			
			RequestDispatcher rd = request.getRequestDispatcher("loginSucess");
			rd.forward(request, response);
			
		}else {
			//if they entered the incorrect password, it should be in the login
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.html");
			
			//need to tell my end user, password is Incorrect
			PrintWriter out = response.getWriter();
			out.println("<font color = red> Incorrect Password </font>");
			//the above should added to the login.html
			rd.include(request, response);
			
		}
	}

}
