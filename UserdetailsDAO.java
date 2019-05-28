package dao;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;;

public class UserdetailsDAO  {
	
	String url="jdbc:mysql://localhost:3306/registration";
	String sql="select * from logindetails where username=? and pswd=?";
	String username="root";
	String password="aranchan2324*";
	public boolean check(String uname, String pswd) throws SQLException
	{
		
	System.out.println("Entering into DAO");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection(url,username,password);
			PreparedStatement st=con.prepareStatement(sql);
			st.setString(1, uname);
			st.setString(2, pswd);
			ResultSet rs=st.executeQuery();
			
			if(rs.next())
			{
				System.out.println("the value returned from DB is"+rs.getString(1));
				return true;
			}
			else
			{
				return false;
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
		catch(SQLException se)
		{
			System.out.println(se.getMessage());
			se.getMessage();
			return false;
		}
		}
		
		
		
		

}
