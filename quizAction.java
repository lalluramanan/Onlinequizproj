package action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.JavaQuizDAO;
import ensc.QuizObject;

public class quizAction {
	
	private ArrayList<QuizObject> quizlist=new ArrayList<QuizObject>();
	private ArrayList<String> options=new ArrayList<String>();
	
	public void setQuizlist(ArrayList<QuizObject> quizlist)
	{
		System.out.println("Entering into setquizlist");
		this.quizlist=quizlist;
		System.out.println("quizlist value is"+this.quizlist.get(0).getQuest());
	}
	public ArrayList<QuizObject> getQuizlist()
	{
		System.out.println("entering into getquizlist");
		return this.quizlist;
	}
	public void setOptions(ArrayList<String> options)
	{
		System.out.println("Entering into setoptions");
		this.options=options;
		
	}
	public ArrayList<String> getOptions()
	{
		System.out.println("entering into getoptions");
		return this.options;
	}
	public String execute()
	{
		
		return "";
	}
	
	public String javaQuizQues() throws SQLException
	{
		try
		{
					
		String language="java";
		
		JavaQuizDAO jqd = new JavaQuizDAO();
		quizlist=jqd.isJavaQuiz(language);
					
		
		System.out.println("options list"+quizlist);
		
		//System.out.println("in javaquesmethod"+quizlist.get(0).getQno());
		if(quizlist.isEmpty())
		{
		return "failure";
	     }
		else
		{
			return "success";
		}
		}
	    catch(SQLException se)
	    {
	    	System.out.println(se.getMessage());
	    	return "failure";
	    }
	}
	public String pythQuizQues()
	{
		return("");
	}
	public String bootQuizQues()
	{
	return("");	
	}

}
