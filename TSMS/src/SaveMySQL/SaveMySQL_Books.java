package SaveMySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import INTERFACE.SaveFunction;
import Message.BookMessage;
import Message.CollectionMessage;
import Message.LessonMessage;
import Message.StudentMessage;
import Message.TeacherMessage;

public class SaveMySQL_Books implements SaveFunction{

	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost:3306/goods?useSSL=false&serverTimezone=UTC";
    
    static final String USER = "root";
    static final String PASS = "123456";
	
	public void Student(StudentMessage s) {}

	public void Teacher(TeacherMessage t) {}

	public void Books(BookMessage b) {
		Connection conn = null;
        try{
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            String sql="INSERT INTO textbooks(ISBN,name,press,author,price)"
            		+"values("+"?,?,?,?,?)";
            PreparedStatement ptmt = conn.prepareStatement(sql);
            ptmt.setString(1, b.getISBN());
            ptmt.setString(2, b.getName());
            ptmt.setString(3, b.getPress());
            ptmt.setString(4, b.getAuthor());
            ptmt.setDouble(5, b.getPrice());
            ptmt.close();
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(conn!=null) conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
	}

	public void Collection(CollectionMessage c) {
		Connection conn = null;
        try{
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            String sql="INSERT INTO collection(ID,lesson,teacher,grade,count,price)"
            		+"values("+"?,?,?,?,?,?)";
            PreparedStatement ptmt = conn.prepareStatement(sql);
            ptmt.setString(1, c.getID());
            ptmt.setString(2, c.getLesson());
            ptmt.setString(3, c.getTeacher());
            ptmt.setString(4, c.getGrade());
            ptmt.setInt(5, c.getCount());
            ptmt.setDouble(6, c.getPrice());
            ptmt.close();
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(conn!=null) conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
	}

	
	public void Lesson(LessonMessage l) {
		Connection conn = null;
        try{
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            String sql="INSERT INTO collection(ID,name,type,credit)"
            		+"values("+"?,?,?,?,?,?)";
            PreparedStatement ptmt = conn.prepareStatement(sql);
            ptmt.setString(1, l.getID());
            ptmt.setString(2, l.getName());
            ptmt.setString(3, l.getType());
            ptmt.setDouble(4, l.getCredit());
            ptmt.close();
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(conn!=null) conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
		
	}

	

}
