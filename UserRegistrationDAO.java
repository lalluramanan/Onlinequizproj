package dao;

import java.sql.*;

import com.sun.corba.se.impl.ior.GenericTaggedComponent;

import ensc.UserRegObject;

public class UserRegistrationDAO  

{
	String url="jdbc:mysql://localhost:3306/registration";
	String sql1="insert into userinfo values(?,?,?,?,?,?,?,?,?,?)";
	String sql2="insert into logindetails values(?,?,?)";
	String username="root";
	String password="aranchan2324*";
	
	public boolean insertRegdata(UserRegObject ob) throws SQLException
	{
		try
		{
	    Class.forName("com.mysql.cj.jdbc.Driver");	
		String firstname= ob.getFirstname();
		String lastname=ob.getLastname();
		String gender=ob.getGender();
		String emailid=ob.getEmailid();
		String address=ob.getAddress();
		String country=ob.getCountry();
		int pincode=ob.getPincode();
		String uname=ob.getUsername();
		String pswd=ob.getPassword();
		String repswd=ob.getRePassword();
		int result=0;
		int result1=0;
		
		Connection con= DriverManager.getConnection(url,username,password);
		PreparedStatement pst=con.prepareStatement(sql1);
		PreparedStatement pst1=con.prepareStatement(sql2);
		pst.setString(1,firstname);
		pst.setString(2,lastname);
		pst.setString(3,gender);
		pst.setString(4,emailid);
		pst.setString(5,address);
		pst.setString(6,country);
		pst.setInt(7,pincode);
		pst.setString(8,uname);
		pst.setString(9,pswd);
		pst.setString(10, repswd);
		pst1.setString(1,uname);
		pst1.setString(2, pswd);
		pst1.setString(3, emailid);
		result=pst.executeUpdate();
		result1=pst1.executeUpdate();
		System.out.println("result is"+result);
		System.out.println("result is"+result1);
		if(result>0 && result1>0)
		{
			
		return true;
		
		}
		else
		{
			System.out.println("cannot insert");
			return false;
		}
		
		}
		catch(SQLException sqe)
		{
			System.out.println(sqe.getMessage());
			return false;
		}
		
		catch(ClassNotFoundException ce)
		{
			return false;
		}
		}
	
}
	

