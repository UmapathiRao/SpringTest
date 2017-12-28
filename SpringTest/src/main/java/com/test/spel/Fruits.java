package com.test.spel;

public class Fruits {

	String name;
	String grade;
	String s="Hi Dude ";
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public String getDetails()
	{
		
		if(name!=null) s=s+name+" #{'this '+ 'is' }"+"  ";
		if(grade!=null) s=s+" having Grade "+grade;
		
		return s;
	}
}
