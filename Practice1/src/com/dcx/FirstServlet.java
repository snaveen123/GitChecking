package com.dcx;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String ename=request.getParameter("name");
		String pass=request.getParameter("password");
		System.out.println(ename);
		System.out.println(pass);
		
	}*/

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
			
			String ename=request.getParameter("name");
			String pass=request.getParameter("password");
			System.out.println(ename);
			System.out.println(pass);
			PrintWriter writer=response.getWriter();
			writer.println(ename);
	}

}
