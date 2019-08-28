package SaveMySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;

import Message.BookMessage;

import java.sql.ResultSet;


public class MySQL_Getbooks {
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost:3306/goods?useSSL=false&serverTimezone=UTC";
    
    static final String USER = "root";
    static final String PASS = "123456";
   public ArrayList Get()
   {
	   ArrayList <BookMessage> list=new ArrayList<>();
	   try{
        Class.forName(JDBC_DRIVER);
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
    
}

