package SaveMySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import Message.BookMessage;
import Message.CollectionMessage;
import Message.LessonMessage;
import Message.StudentMessage;
import Message.TeacherMessage;
import INTERFACE.SaveFunction;

public class SaveMySQL_People implements SaveFunction{
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost:3306/people?useSSL=false&serverTimezone=UTC";
    
    static final String USER = "root";
    static final String PASS = "123456";
	
	public boolean Student(StudentMessage s) 
	{
		Connection conn = null;
        try{
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            String sql="INSERT INTO students(ID,name,sex,college,garde)"
            		+"values("+"?,?,?,?,?)";
            PreparedStatement ptmt = conn.prepareStatement(sql);
            ptmt.setString(1, s.getID());
            ptmt.setString(2, s.getName());
            ptmt.setString(3, s.getSex());
            ptmt.setString(4, s.getCollege());
            ptmt.setString(5, s.getGrade());
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
        return true;
	}
	
	public boolean Teacher(TeacherMessage t) {
		Connection conn = null;
        try{
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            String sql="INSERT INTO teachers(ID,name,sex,college,jurisdiction)"
            		+"values("+"?,?,?,?,?)";
            PreparedStatement ptmt = conn.prepareStatement(sql);
            ptmt.setString(1, t.getID());
            ptmt.setString(2, t.getName());
            ptmt.setString(3, t.getSex());
            ptmt.setString(4, t.getCollege());
            ptmt.setString(5, t.getJurisdiction());
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
		return true;
	}
	public boolean Books(BookMessage b) {return false;}
	public boolean Collection(CollectionMessage c) {return false;}
	public boolean Lesson(LessonMessage l) {return false;}
}
