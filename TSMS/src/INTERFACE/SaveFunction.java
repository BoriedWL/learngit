package INTERFACE;

import Message.BookMessage;
import Message.CollectionMessage;
import Message.LessonMessage;
import Message.StudentMessage;
import Message.TeacherMessage;

public interface SaveFunction 
{
	public boolean Student(StudentMessage s);
	public boolean Teacher(TeacherMessage t);
	public boolean Books(BookMessage b);
	public boolean Collection(CollectionMessage c);
	public boolean Lesson(LessonMessage l);
}
