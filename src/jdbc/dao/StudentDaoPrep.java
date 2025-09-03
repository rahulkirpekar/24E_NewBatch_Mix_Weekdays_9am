package jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import jdbc.bean.StudentBean;
import jdbc.util.DbConnection;

public class StudentDaoPrep 
{
	public int insertStudent(StudentBean s) 
	{
		int rowsAffected = 0;
		
		String insertQuery = "INSERT INTO student(name,std,marks) VALUES (?,?,?)";
	
		System.out.println("insertQuery : " + insertQuery);
			
		PreparedStatement pstmt = null;
		
		// 1. get Connection
		Connection conn = DbConnection.getConnection();

		if (conn != null) 
		{
			
			try 
			{
				pstmt = conn.prepareStatement(insertQuery);
			
				pstmt.setString(1, s.getName());
				pstmt.setInt(2, s.getStd());
				pstmt.setInt(3, s.getMarks());
			
				rowsAffected = pstmt.executeUpdate();
			
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
			
		} else 
		{
			System.out.println("StudentDaoPrep----insertStudent() Db not connected");
		}
		return rowsAffected;
	}

	// Update Query
	public int updateStudent(StudentBean s , int id) 
	{
		String updateQuery = "UPDATE student SET name=?,std=? ,marks=? WHERE id=?";
		System.out.println("updateQuery : " + updateQuery);
		Connection conn = DbConnection.getConnection();
		PreparedStatement pstmt = null;
		int rowsAffected = 0;
		if (conn!=null) 
		{
			try 
			{
				pstmt = conn.prepareStatement(updateQuery);
				
				pstmt.setString(1, s.getName());
				pstmt.setInt(2, s.getStd());
				pstmt.setInt(3, s.getMarks());
				pstmt.setInt(4, id);
				
				rowsAffected = pstmt.executeUpdate();
			
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
		String deleteQuery = "DELETE FROM student WHERE id = ?";
		
		Connection conn = 	DbConnection.getConnection();
		PreparedStatement pstmt = null;
		if (conn != null) 
		{
			try 
			{
				pstmt = conn.prepareStatement(deleteQuery);
			
				pstmt.setInt(1, id);
				
				rowsAffetced = pstmt.executeUpdate();
			
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
		
	public ArrayList<StudentBean> getAllRecords() 
	{
		String selectQuery = "SELECT * FROM student";
		ResultSet rs = null;
		Connection conn = DbConnection.getConnection();
		PreparedStatement pstmt = null;
		StudentBean s = null;
		ArrayList<StudentBean> list = new ArrayList<StudentBean>();
		if (conn!=null) 
		{
			try 
			{
				pstmt = conn.prepareStatement(selectQuery);
						
				rs = pstmt.executeQuery();

				while(rs.next()) 
				{
					int id = rs.getInt(1);
					String name = rs.getString(2);
					int std = rs.getInt(3);
					int marks = rs.getInt(4);

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
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name : ");
		String name= sc.nextLine();
		System.out.println("Enter Std : ");
		int std= sc.nextInt();
		System.out.println("Enter Marks : ");
		int marks= sc.nextInt();
		
		StudentBean s = new StudentBean(0, name, std, marks);
		
		StudentDaoPrep dao = new StudentDaoPrep();
		
		int rowsAffected = 	dao.insertStudent(s);
		
		if (rowsAffected > 0 ) 
		{
			System.out.println("Student record Inserted = " + rowsAffected);
			
		} else 
		{
			System.out.println("Student record Inserted= " + rowsAffected);
		}
	}
}
