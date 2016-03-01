package MyPracticeScripts;



import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.spi.DirStateFactory.Result;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import com.mysql.jdbc.PreparedStatement;

public class DatabaseDataLogin {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException 
	{
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://opensource.demo.orangehrm.com/index.php/auth/login");
		Connection conn=null;
		String url="jdbc:mysql://localhost:3306/";
		String dbname="test";
		String DBdriver="com.mysql.jdbc.Driver";
		String username="root";
		String password="root123";
		Class.forName(DBdriver).newInstance();
		conn=(Connection) DriverManager.getConnection(url+dbname, username, password);
		PreparedStatement psmt=(PreparedStatement) conn.prepareStatement("select * from employee");
		ResultSet rs=psmt.executeQuery();
		while (rs.next())
		{
			d.findElement(By.id("txtUsername")).sendKeys(rs.getString(2));
			d.findElement(By.id("txtPassword")).sendKeys(rs.getString(3));
			d.findElement(By.id("btnLogin")).click();
			Sleeper.sleepTightInSeconds(3);
			d.findElement(By.id("welcome")).click();
			Sleeper.sleepTightInSeconds(2);
			d.findElement(By.linkText("Logout")).click();
			Sleeper.sleepTightInSeconds(2);
			
			
		}
		
		

	}

}
