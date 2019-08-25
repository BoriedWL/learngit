package Funtion;

import java.util.ArrayList;

import INTERFACE.UserFunction;
import Message.StudentMessage;
import Message.TeacherMessage;

public class UserMessage_Controller implements UserFunction
{
	ArrayList<StudentMessage> std=new ArrayList<>();
	ArrayList<TeacherMessage> tea=new ArrayList<>();
	
	public void StudentMessage_enter(String ID,String name,String sex,String college,String grade) 
	{
		StudentMessage student=new StudentMessage();
		student.setCollege(college);
		student.setGrade(grade);
		student.setID(ID);
		student.setName(name);
		student.setSex(sex);
		std.add(student);
	}

	
	public void TeacherMessage_enter(String ID,String name,String sex,String college,String jurisdiction) 
	{
		TeacherMessage teacher=new TeacherMessage();
		teacher.setCollege(college);
		teacher.setID(ID);
		teacher.setJurisdiction(jurisdiction);
		teacher.setName(name);
		teacher.setSex(sex);
		tea.add(teacher);
	}

	public String StudentMessage_inquire(String name) {
		for(int i=0;i<std.size();i++)
		{
			if(std.get(i).getName().equals(name))
				return std.get(i).getCollege()+"/t"
						+std.get(i).getGrade()+"/t"
						+std.get(i).getID()+"/t"
						+std.get(i).getName()+"/t"
						+std.get(i).getSex()+"/t"
						+std.get(i).getClass();
		}
		return null;
	}

	public String TeacherMessage_inquire(String name) 
	{
		for(int i=0;i<std.size();i++)
		{
			if(tea.get(i).getName().equals(name))
				return tea.get(i).getCollege()+"/t"
						+tea.get(i).getID()+"/t"
						+tea.get(i).getName()+"/t"
						+tea.get(i).getJurisdiction()+"/t"
						+tea.get(i).getClass();
		}
		return null;
	}

}
