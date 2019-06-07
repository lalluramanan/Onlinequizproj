package ensc;

import java.awt.List;
import java.util.ArrayList;

public class QuizObject {
	
	private String quest;
	private String opt1;
	private String opt2;
	private String opt3;
	private String opt4;
	private String ans;
	
	private int qno;
	private ArrayList<String> optar=new ArrayList<String>();
	
	
	public void setQno(int qno)
	{
		this.qno=qno;
	}
	public int getQno()
	{
		return this.qno;
	}
	
	public void setQuest(String quest)
	{
		this.quest=quest;
	}
	public String getQuest()
	{
		return this.quest;
	}
	
	public void setOptarr(ArrayList<String> optar)
	{
		this.optar=optar;
	}
	public ArrayList<String> getOptarr()
	{
		return this.optar;
	}
	
	public void setAns(String ans)
	{
		this.ans=ans;
	}
	public String getAns()
	{
		return this.ans;
	}
	
	
	

}
