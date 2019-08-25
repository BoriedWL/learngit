import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class AddTextBook 
{
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost:3306/goods?useSSL=false&serverTimezone=UTC";
    
    static final String USER = "root";
    static final String PASS = "123456";
    AddTextBook(String s)
    {
    	System.out.println(s);
    	String [] str=s.split(",");
    	Connection con=null;
    	PreparedStatement ps=null;
    	try {
    		Class.forName(JDBC_DRIVER);											//×¢²áJDBC
    		con=DriverManager.getConnection(DB_URL, USER, PASS);				//´ò¿ªÁ´½Ó
    		String sql="INSERT INTO textbooks(ISBN,name,press,author,price) "+"values(?,?,?,?,?)";
    		ps=con.prepareStatement(sql);
    		
    		ps.setString(1, str[0]);
    		
    		ps.setString(2, str[1]);
    		
    		ps.setString(3, str[2]);
    		
    		ps.setString(4, str[3]);
    		
    		ps.setDouble(5, Double.parseDouble(str[4]));
    		ps.execute();
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
}
