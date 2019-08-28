package SaveMySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;

import INTERFACE.MySQL_Getter;
import Message.BookMessage;
import Message.CollectionMessage;
import Message.LessonMessage;

import java.sql.ResultSet;


public class MySQL_GetGoods implements MySQL_Getter{
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost:3306/goods?useSSL=false&serverTimezone=UTC";
    
    static final String USER = "root";
    static final String PASS = "123456";
   public ArrayList GetBooks()
   {
	   ArrayList <BookMessage> list=new ArrayList<>();
	   try{
        Class.forName(JDBC_DRIVER);				//JDBCÇý¶¯
        Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
        String sql="SELECT * FROM textbooks;";
        Statement stmt =  con.createStatement();
        ResultSet rs=stmt.executeQuery(sql);
		while (rs.next()) 
			{
				BookMessage b=new BookMessage();
				b.setISBN(rs.getString("ISBN"));
				b.setName(rs.getString("name"));
				b.setPress(rs.getString("press"));
				b.setAuthor(rs.getString("author"));
				b.setPrice(rs.getDouble("price"));
				list.add(b);
			}
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
	   return list;
   }

public ArrayList GetStd() {
	return null;
}

public ArrayList GetTer() {
	 return null;
	
}

public ArrayList GetLesson() {
	ArrayList <LessonMessage> list=new ArrayList<>();
	   try{
     Class.forName(JDBC_DRIVER);
     Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
     String sql="SELECT * FROM lesson;";
     Statement stmt =  con.createStatement();
     ResultSet rs=stmt.executeQuery(sql);
		while (rs.next()) 
			{
				LessonMessage l=new LessonMessage();
				l.setCredit(rs.getDouble("credit"));
				l.setID(rs.getString("ID"));
				l.setName(rs.getString("name"));
				l.setType(rs.getString("type"));
				list.add(l);
			}
 	}
 	catch(Exception e)
 	{
 		e.printStackTrace();
 	}
	   return list;
}

public ArrayList GetCollection() {
	ArrayList <CollectionMessage> list=new ArrayList<>();
	   try{
     Class.forName(JDBC_DRIVER);
     Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
     String sql="SELECT * FROM collection;";
     Statement stmt =  con.createStatement();
     ResultSet rs=stmt.executeQuery(sql);
		while (rs.next()) 
			{
				CollectionMessage c=new CollectionMessage();
				c.setCount(rs.getInt("count"));
				c.setGrade(rs.getString("grade"));
				c.setID(rs.getString("ID"));
				c.setLesson(rs.getString("lesson"));
				c.setPrice(rs.getDouble("price"));
				c.setTeacher(rs.getString("teacher"));
				list.add(c);
			}
 	}
 	catch(Exception e)
 	{
 		e.printStackTrace();
 	}
	   return list;
	
}
    
}

