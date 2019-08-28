package Funtion;

import java.util.ArrayList;
import INTERFACE.LessonFunction;
import Message.LessonMessage;

public class LessonMessage_Controller implements LessonFunction{
	ArrayList <LessonMessage> les=new ArrayList<>();
	public boolean Lesson_enter(String ID,String name,String type,double credit) 
	{
		LessonMessage lesson=new LessonMessage();
		lesson.setCredit(credit);
		lesson.setID(ID);
		lesson.setName(name);
		lesson.setType(type);
		les.add(lesson);
		return true;
	}

	public String Lesson_inquire(String name) 
	{
		for(int i=0;i<les.size();i++)
		{
			if(les.get(i).getName().equals(name))
				return les.get(i).getCredit()+"/t"
						+les.get(i).getID()+"/t"
						+les.get(i).getName()+"/t"
						+les.get(i).getType();
		}
		return null;
	}
	
}
