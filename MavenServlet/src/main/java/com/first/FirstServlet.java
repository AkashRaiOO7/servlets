package com.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter pw= resp.getWriter();
		/*String name= req.getParameter("naam");
		String password= req.getParameter("kunji");
		pw.print("Name: "+name +" Password: "+ password);
		*/
		pw.print("Hello!!");
	}
}
