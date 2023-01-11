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
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class loginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String enteredUserName = request.getParameter("username");
		String enteredPassword = request.getParameter("password");
		
		if (enteredPassword.equals("admin")) {
			System.out.println("logged in!!");
			
			HttpSession session = request.getSession();
			session.setAttribute("username", enteredUserName);
			
			session.setMaxInactiveInterval(10);

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
