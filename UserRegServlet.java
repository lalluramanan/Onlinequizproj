package com.jspservlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import dao.UserRegistrationDAO;
import ensc.UserRegObject;

@WebServlet("/UserRegServlet")
public class UserRegServlet extends HttpServlet 

{

	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException 
	{
		try
		{
			boolean result;
		String fname=req.getParameter("fname");
		String lname=req.getParameter("lname");
		String gender=req.getParameter("gendr");
		String emlid=req.getParameter("emailid");
		String address=req.getParameter("address");
		String country=req.getParameter("cntry");
		String pincode=req.getParameter("pcode");
		int picode=Integer.parseInt(pincode);
		String username=req.getParameter("uname");
		String password=req.getParameter("pswd");
		String repswd=req.getParameter("pswd1");
	
		HttpSession hs=req.getSession();
		hs.setAttribute("fname", fname);
		hs.setAttribute("lname", lname);
		hs.setAttribute("gender", gender);
		hs.setAttribute("emailid", emlid);
		hs.setAttribute("address", address);
		hs.setAttribute("country", country);
		hs.setAttribute("pincode", picode);
		hs.setAttribute("username", username);
		hs.setAttribute("password", password);
		hs.setAttribute("repswd", repswd);
		
		UserRegObject usro =new UserRegObject();
		usro.setFirstname(fname);
		usro.setLastname(lname);
		usro.setGender(gender);
		usro.setEmailid(emlid);
		usro.setAddress(address);
		usro.setCountry(country);
		usro.setPincode(picode);
		usro.setUsername(username);
		usro.setPassword(password);
		usro.setRePassword(repswd);
		
		UserRegistrationDAO usr=new UserRegistrationDAO();
		
		result=usr.insertRegdata(usro);
		if(result==true)
		{
			//res.sendRedirect("Home.jsp");
			req.setAttribute("info","Signedup");
			req.getRequestDispatcher("UserRegistry.jsp").forward(req,res);
		}
		else
		{
			
			System.out.println("There is error while inserting");
			res.sendRedirect("Error.jsp");
		}
		}
		
		catch(SQLException se)
		{
			System.out.println(se.getMessage());
		res.sendRedirect("Error.jsp");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			res.sendRedirect("Error.jsp");
		}
	
		
	}
	
	
}
