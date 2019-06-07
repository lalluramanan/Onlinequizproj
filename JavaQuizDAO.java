package dao;

import java.sql.*;
import java.util.ArrayList;

import com.sun.corba.se.impl.ior.GenericTaggedComponent;

import ensc.QuizObject;

public class JavaQuizDAO {

	String url = "jdbc:mysql://localhost:3306/registration";
	String sql = "select * from quizquest where subj=?";
	// String sql2="select count(*) from quizquest where subj=?";
	String username = "root";
	String password = "aranchan2324*";

	public ArrayList<QuizObject> isJavaQuiz(String lang) throws SQLException {
		ArrayList<QuizObject> quizar = new ArrayList<QuizObject>();

		int count = 0;
		System.out.println("Entering into DAO");
		try {

			System.out.println("hi");

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, lang);

			ResultSet rs = st.executeQuery();

			while (rs.next()) {
				QuizObject qo = new QuizObject();
				ArrayList<String> options= new ArrayList<String>();
				qo.setQno(rs.getInt(2));
				qo.setQuest(rs.getString(3));
				options.add( rs.getString(4));
				options.add(rs.getString(5));
				if(rs.getString(6).isEmpty())
				{
					System.out.println("opt3 value is  empty");
				}
				else
				{
					options.add(rs.getString(6));
				}
				
				if(rs.getString(7).isEmpty())
				{
					System.out.println("opt4 value is  empty");
				
				}
				else
				{
					options.add(rs.getString(7));
				}
				qo.setOptarr(options);
				qo.setAns(rs.getString(8));

				quizar.add(qo);
				

			}
			
			return quizar;
		} catch (Exception e) {
			System.out.println("Error!!");
			System.out.println(e.getMessage());
			return quizar;
		}
	}
}
