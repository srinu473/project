package MyPracticeScripts;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class Databasedata {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException 
	{
		Connection conn=null;
		String url="jdbc:mysql://localhost:3306";
		String dbname="test";
		String DBdriver="com.mysql.jdbc.Driver";
		String username="root";
		String password="root123";
		
		Class.forName(DBdriver).newInstance();
		conn=(Connection) DriverManager.getConnection(url+dbname, username, password);
		PreparedStatement psmt=(PreparedStatement) conn.prepareStatement("select * from employee where empname=? and id=?");
		psmt.setString(1, "srinu");
		psmt.setString(2, "2");
		ResultSet rs=psmt.executeQuery();
		while (rs.next())
		{
			for (int i = 0; i <=5; i++) 
			{
				System.out.print(rs.getString(i)+"----");
			}
			System.out.println();
			
		}
		conn.close();
		
		

	}

}
