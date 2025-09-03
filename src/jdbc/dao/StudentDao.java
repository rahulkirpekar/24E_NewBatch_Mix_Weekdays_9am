package jdbc.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import jdbc.bean.StudentBean;
import jdbc.util.DbConnection;

public class StudentDao 
{
	// Insert Query
	public int insertStudent(StudentBean s) 
	{
		int rowsAffected = 0;
		
		String insertQuery = "INSERT INTO student(name,std,marks) VALUES ('"+s.getName()+"',"+s.getStd()+","+s.getMarks()+")";
	
		System.out.println("insertQuery : " + insertQuery);
		
		Statement stmt = null;
		
		// 1. get Connection
		Connection conn = DbConnection.getConnection();

		// 2. validate conn
		if (conn!=null) 
		{
			try 
			{
				// 3. create statement object
				stmt = conn.createStatement();
				
				// 4. insert query execute
				rowsAffected = stmt.executeUpdate(insertQuery);
				
				
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
			
		} else 
		{
			System.out.println("Db not cconnected");
		}
		return rowsAffected;
	}
	// Update Query
	public int updateStudent(StudentBean s , int id) 
	{
		String updateQuery = "UPDATE student SET name='"+s.getName()+"',std="+s.getStd()+",marks="+s.getMarks()+" WHERE id="+id;
		System.out.println("updateQuery : " + updateQuery);
		Connection conn = DbConnection.getConnection();
		Statement stmt = null;
		int rowsAffected = 0;
		if (conn!=null) 
		{
			try 
			{
				stmt = conn.createStatement();
			
				rowsAffected = stmt.executeUpdate(updateQuery);
			
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("Db not connected : " + conn);
		}
		return rowsAffected;
	}
	// Delete Query
	public int deleteStudent(int id) 
	{
		int rowsAffetced = 0;
		String deleteQuery = "DELETE FROM student WHERE id = "+id;
		
		Connection conn = 	DbConnection.getConnection();
		Statement stmt = null;
		if (conn != null) 
		{
			try 
			{
				stmt = conn.createStatement();
			
				rowsAffetced = stmt.executeUpdate(deleteQuery);
			
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
			
		} else 
		{
			System.out.println("Db not connected");
		}
		return rowsAffetced;
	}
	
	// 	Select Query
	public ArrayList<StudentBean> getAllRecords() 
	{
		String selectQuery = "SELECT * FROM student";
		ResultSet rs = null;
		Connection conn = DbConnection.getConnection();
		Statement stmt = null;
		StudentBean s = null;
		ArrayList<StudentBean> list = new ArrayList<StudentBean>();
		if (conn!=null) 
		{
			try 
			{
				stmt = conn.createStatement();
			
				rs = stmt.executeQuery(selectQuery);

				while(rs.next()) 
				{
					int id = rs.getInt(1);
					String name = rs.getString(2);
					int std = rs.getInt(3);
					int marks = rs.getInt(4);

//					System.out.println(id + " " + name+" " + std+" " + marks);
					
					s = new StudentBean(id, name, std, marks);
					
					list.add(s);
				}
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("Db not cconnected");
		}
		return list; 
	}

	public static void main(String[] args) 
	{
		
		StudentDao dao = new StudentDao();

		ArrayList<StudentBean> list = dao.getAllRecords();
		
		for (int i = 0; i < list.size(); i++) 
		{
			StudentBean s =	list.get(i);
			System.out.println(s.getId()+" " + s.getName()+" " + s.getStd()+" " +s.getMarks());
		}
		
/*		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id Which You wwant to Update Student Record : ");
		int id= sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		String name= sc.nextLine();
		System.out.println("Enter Std : ");
		int std= sc.nextInt();
		System.out.println("Enter Marks : ");
		int marks= sc.nextInt();
		
		StudentBean s = new StudentBean(0, name, std, marks);
		
		StudentDao dao = new StudentDao();
		
		int rowsAffected = 	dao.updateStudent(s, id);
		
		if (rowsAffected > 0 ) 
		{
			System.out.println("Student record suuccssfully Updated = " + rowsAffected);
		} else 
		{
			System.out.println("Student record not Updated" + rowsAffected);
		}   
   //---------------------------------------------------------------------------------------
		System.out.println("Enter Id Which You wwant to Delete Student Record : ");
		int id= sc.nextInt();

		StudentDao dao = new StudentDao();
		
		int rowsAffected = 	dao.deleteStudent(id);
		
		if (rowsAffected > 0 ) 
		{
			System.out.println("Student record suuccssfully Deleted = " + rowsAffected);
			
		} else 
		{
			System.out.println("Student record not Deleted" + rowsAffected);
		}   
   		----------------------------------------------------------
		System.out.println("Enter Name : ");
		String name= sc.nextLine();
		System.out.println("Enter Std : ");
		int std= sc.nextInt();
		System.out.println("Enter Marks : ");
		int marks= sc.nextInt();
		
		StudentBean s = new StudentBean(0, name, std, marks);
		
		StudentDao dao = new StudentDao();
		
		int rowsAffected = 	dao.insertStudent(s);
		
		if (rowsAffected > 0 ) 
		{
			System.out.println("Db connected = " + rowsAffected);
			
		} else 
		{
			System.out.println("Db not connected = " + rowsAffected);
		}
*/		
	}
}

