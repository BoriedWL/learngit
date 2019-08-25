package INTERFACE;

import Message.BookMessage;
import Message.CollectionMessage;
import Message.LessonMessage;
import Message.StudentMessage;
import Message.TeacherMessage;

public interface SaveFunction 
{
	public void Student(StudentMessage s);
	public void Teacher(TeacherMessage t);
	public void Books(BookMessage b);
	public void Collection(CollectionMessage c);
	public void Lesson(LessonMessage l);
}
