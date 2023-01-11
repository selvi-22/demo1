package com.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/loginSucess")
public class LoginSucessServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		String username = (String)(session.getAttribute("username"));
          
		if(username== null) {
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.html");
			//need to tell my end user, password is Incorrect
			PrintWriter out = response.getWriter();
			out.println("<font color = red> Session is timeout!! Login again </font>");
			rd.include(request, response);
		}else {
		
		String sessionId = session.getId();

		long creationTime = session.getCreationTime();
		long lastAccessedTime = session.getLastAccessedTime();

		Date createDate = new Date(creationTime);
		Date lastAccessedDate = new Date(lastAccessedTime);

		// print the retrieved attribute using the PrintWriter
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>Username is: " + username + " </h1>");

		out.println(" Your Session Infomation: <br/>");
		out.println("ID: " + sessionId + "<br/>");
		out.println("Session Created Date: " + createDate + "<br/>");
		out.println("Session Created Time: " + creationTime + "<br/>");
		out.println("Last Accessed Date : " + lastAccessedDate + "<br/>");
		out.println("Last Accessed Time: " + lastAccessedTime + "<br/>");
		}
	}

}
