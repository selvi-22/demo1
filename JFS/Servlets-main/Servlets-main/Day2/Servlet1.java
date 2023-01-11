package com.demo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("response from servlet 1 before forward!! ");
		
		RequestDispatcher rd = request.getRequestDispatcher("servlet2");
		rd.forward(request, response);
		//after forwarding below lines will not be exceuted
		response.getWriter().append("response from servlet1 after forward!! ");
	}

}
