package com.jspservlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserdetailsDAO;



public class UserVerification extends HttpServlet
{

	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		String uname= req.getParameter("username");
		String pswd=req.getParameter("pwd");
		
		UserdetailsDAO udet=new UserdetailsDAO();
		try
		{
		if(udet.check(uname, pswd))
		{
			//RequestDispatcher rd= req.getRequestDispatcher("home");
			//rd.forward(req, res);
			
			HttpSession session=req.getSession();
			session.setAttribute("dept", "Software Programmer");
			req.setAttribute("dept", "Software Programmer");
			res.sendRedirect("home.jsp");
		}
		else
		{
			req.setAttribute( "mess","*Userid or password does not match");
			//res.sendRedirect("Error.jsp");
			req.getRequestDispatcher("Login.jsp").forward(req, res);
		}
		}
		catch(SQLException se)
		{
			se.printStackTrace();
			res.sendRedirect("Error.jsp");
		}
		
		/*else
		{
			//res.getWriter().println("Wrong userid or password! Please try again");
		}*/
	}
	}
	

