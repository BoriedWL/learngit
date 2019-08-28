package SaveMySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import INTERFACE.MySQL_Getter;
import Message.BookMessage;
import Message.StudentMessage;
import Message.TeacherMessage;

public class MySQL_GetPeople implements MySQL_Getter{
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost:3306/people?useSSL=false&serverTimezone=UTC";
    
    static final String USER = "root";
    static final String PASS = "123456";
	
	public ArrayList GetBooks() {
		return null;
	}

	
	public ArrayList GetStd() {
		ArrayList <StudentMessage> list=new ArrayList<>();
		   try{
	        Class.forName(JDBC_DRIVER);				
	        Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
	        String sql="SELECT * FROM students;";
	        Statement stmt =  con.createStatement();
	        ResultSet rs=stmt.executeQuery(sql);
			while (rs.next()) 
				{
					StudentMessage s=new StudentMessage();
					s.setCollege(rs.getString("college"));
					s.setGrade(rs.getString("grade"));
					s.setID(rs.getString("ID"));
					s.setName(rs.getString("name"));
					s.setSex(rs.getString("sex"));
					list.add(s);
				}
	    	}
	    	catch(Exception e)
	    	{
	    		e.printStackTrace();
	    	}
		return null;
	}

	
	public ArrayList GetTer() {
		ArrayList <TeacherMessage> list=new ArrayList<>();
		   try{
	        Class.forName(JDBC_DRIVER);				
	        Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
	        String sql="SELECT * FROM teachers;";
	        Statement stmt =  con.createStatement();
	        ResultSet rs=stmt.executeQuery(sql);//预处理
			while (rs.next()) 
				{
					TeacherMessage t=new TeacherMessage();
					t.setCollege(rs.getString("college"));
					t.setID(rs.getString("ID"));
					t.setJurisdiction("jurisdiction");//权限
					t.setName(rs.getString("name"));
					t.setSex(rs.getString("sex"));
					list.add(t);
				}
	    	}
	    	catch(Exception e)
	    	{
	    		e.printStackTrace();
	    	}
		return null;
	}

	
	public ArrayList GetLesson() {
		return null;
	}

	
	public ArrayList GetCollection() {
		return null;
	}

}
