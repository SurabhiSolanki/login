package com.java;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		PrintWriter out= response.getWriter();
		out.println("<h1>hello</h1>");
		String username= request.getParameter("username");
		//String result=request.getParameter("result");
		System.out.println(username);
		String password= request.getParameter("password");
		if(username.equals("testuser_1") && password.equals("Test@123")) {
			//result="correct";
			//response.sendRedirect("https://www.amazon.in");
			out.println("<p id=oo>correct</p>");
			
		}else if(username.equals("testuser_2") && password.equals("Test@123")) {
			//result="correct";
			//response.sendRedirect("https://www.amazon.in");
			out.println("<p id=oo>correct</p>");
		}else {
			//result="wrong";
			//response.sendRedirect("wrong.html");
			out.println("<p id=oo>wrong</p>");
			
		}
	
		
	}

}
