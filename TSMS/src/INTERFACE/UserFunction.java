package INTERFACE;

public interface UserFunction {
	
		
		public boolean StudentMessage_enter(String ID,String name,String sex,String college,String grade);
		public boolean TeacherMessage_enter(String ID,String name,String sex,String college,String jurisdiction);
		public String StudentMessage_inquire(String name);
		public String TeacherMessage_inquire(String name);
		
}
