import java.sql.*;
import java.util.*;

public class test {
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost:3306/people?useSSL=false&serverTimezone=UTC";
    
    static final String USER = "root";
    static final String PASS = "123456";
    
    public static void main(String []args)
    {
    	Connection conn = null;
        Statement stmt = null;
        try{
            // ע�� JDBC ����
            Class.forName(JDBC_DRIVER);
        
            // ������
            System.out.println("�������ݿ�...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
        
            // ִ�в�ѯ
            System.out.println(" ʵ����Statement����...");
            stmt = conn.createStatement();
            String sql;
            sql = "INSERT INTO students VALUES ('201810098228','ZWL','��','�����ѧԺ','�������4��')";
            stmt.execute(sql);
            // ��ɺ�ر�
            stmt.close();
            conn.close();
        }catch(SQLException se){
            // ���� JDBC ����
            se.printStackTrace();
        }catch(Exception e){
            // ���� Class.forName ����
            e.printStackTrace();
        }finally{
            // �ر���Դ
            try{
                if(stmt!=null) stmt.close();
            }catch(SQLException se2){
            }// ʲô������
            try{
                if(conn!=null) conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye!");
    }
    
    public String getID()
    {
    	String str;
    	Scanner sc=new Scanner(System.in);
    	str=sc.next();
    	return str;
    }
}
