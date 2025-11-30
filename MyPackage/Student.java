package MyPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Student {
	public void createDatabase() {
		String url="jdbc:mysql://localhost:3306/";
		String userName="root";
		String passWord="";
		try {
			
			Connection conn=DriverManager.getConnection(url, userName, passWord);
			System.out.println("Connected Successfully!");
			Statement stm=conn.createStatement();
			
			String query="create database DB";
			stm.execute(query);
			System.out.println("Dtabase connected successfully");
			conn.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void createTable() {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/";
		String db="db";
		String userName="root";
		String passWord="";
		try {
			
			Connection conn=DriverManager.getConnection(url+db, userName, passWord);
			
			Statement stm=conn.createStatement();
			
			String query="create table student (sid int(3), sname varchar(200), semail varchar(200))";
			stm.execute(query);
			System.out.println("Table created successfully");
			conn.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public void createData() {
		// TODO Auto-generated method stub
		try {
			String url="jdbc:mysql://localhost:3306/";
			String db="db";
			String userName="root";
			String passWord="";
			
			Connection conn=DriverManager.getConnection(url+db, userName, passWord);
			String query="INSERT into student (sid, sname, semail) values (?,?,?)";
			
			PreparedStatement pstm=conn.prepareStatement(query);
			pstm.setInt(1,11);
			pstm.setString(2, "Aman");
			pstm.setString(3, "Aman@gmail.com");
			
			pstm.executeUpdate();//pstm.execute() also work pstm.executeQuery() run nhi krega
			System.out.println("Data inserted successfully");
			conn.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public void readData() {
		// TODO Auto-generated method stub
		try {
			String url="jdbc:mysql://localhost:3306/";
			String db="db";
			String userName="root";
			String passWord="";
			
			Connection conn=DriverManager.getConnection(url+db, userName, passWord);
			String query="select * from student";
			
			Statement stm=conn.createStatement();
			
			
			ResultSet rs=stm.executeQuery(query);//
			while(rs.next()) {
				System.out.println("id = "+rs.getInt(1));
				System.out.println("Name = "+rs.getString(2));
				System.out.println("Email = "+rs.getString(3));
			}
			System.out.println("Data read successfully");
			conn.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public void updateData() {
		// TODO Auto-generated method stub
		try {
			String url="jdbc:mysql://localhost:3306/";
			String db="db";
			String userName="root";
			String passWord="";
			
			Connection conn=DriverManager.getConnection(url+db, userName, passWord);
			String query="UPDATE student set sid = ? where sname = ?";
			
			PreparedStatement pstm=conn.prepareStatement(query);
			pstm.setInt(1,12);
			pstm.setString(2, "Aman");
			
			pstm.execute();//pstm.execute() also work pstm.executeQuery() run nhi krega
			System.out.println("Data updated successfully");
			conn.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public void deleteData() {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/";
		String db="db";
		String userName="root";
		String passWord="";
		try {
			
			Connection conn=DriverManager.getConnection(url+db, userName, passWord);
			
			String sql = "DELETE FROM student WHERE sid = ?";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, 12);
			stmt.execute();
			System.out.println("Data deleted successfully");
			conn.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

	
}

