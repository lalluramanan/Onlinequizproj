package com.jspservlet;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HomePage extends HttpServlet

{
public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
{
	//res.getWriter().println("Welcome to Lalit home page");
	//HttpSession session=req.getSession();
	//String deptmt=(String)session.getAttribute("dept");
	//String deptmt=(String)req.getAttribute("dept");
	/*if(deptmt.equals("Software Programmer"))
	{
		res.getWriter().println("Your Designation is Software Programmer");
	}
	else
	{
		res.getWriter().println("Designation yet to be decided");
	}*/
}
}
