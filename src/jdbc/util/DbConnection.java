package jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection 
{
	// 1. Database Credentials --MySQL
	//---------------------------------
	private static final String URLNAME     ="jdbc:mysql://localhost:3306/morning24";
	private static final String DRIVERCLASS ="com.mysql.cj.jdbc.Driver";
	private static final String USERNAME    ="root";
	private static final String PASSWORD    ="root";
	// 2. create database connection
	public static Connection getConnection() 
	{
		Connection conn = null;
		try 
		{
			// 3. Load Driverclass
			Class.forName(DRIVERCLASS);
			
			// 4. pass Db Credentials into DriverManager's getConnection method
			conn = DriverManager.getConnection(URLNAME, USERNAME, PASSWORD);
			
			// 5. validate conn object
			if (conn != null) 
			{
				System.out.println("DB Connected : " + conn);
			} else 
			{
				System.out.println("Db not connected");
			}
		} catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void main(String[] args) 
	{
		DbConnection.getConnection();
	}
}
