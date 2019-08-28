package Funtion;

import INTERFACE.CollectionFunction;
import Message.CollectionMessage;

import java.util.*;

public class CollectionMessage_Controller implements CollectionFunction{
	ArrayList <CollectionMessage> clist=new ArrayList<>();
	public boolean collection_enter(String ID, String lesson, String teacher, String grade, int count, double price) {
		CollectionMessage cm=new CollectionMessage();
		cm.setCount(count);
		cm.setGrade(grade);
		cm.setID(ID);
		cm.setLesson(lesson);
		cm.setPrice(price);
		cm.setTeacher(teacher);
		clist.add(cm);
		return true;
	}

	
	public String check(String name) {
		for(int i=0;i<clist.size();i++)
		{
			if(clist.get(i).getTeacher().equals(name)
					&&clist.get(i).getGrade().equals(name)
					&&clist.get(i).getID().equals(name)
					&&clist.get(i).getLesson().equals(name)
					)
				return clist.get(i).getCount()
						+"/t"+clist.get(i).getGrade()
						+"/t"+clist.get(i).getID()
						+"/t"+clist.get(i).getLesson()
						+"/t"+clist.get(i).getPrice()
						+"/t"+clist.get(i).getTeacher();
		}
		return null;
		
	}

	public void collect() {
		
	}

}
