package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.masai.model.Student;
import com.masai.utility.DBUtil;

public class StudentDaoImpl implements StudentDao{

	@Override
	public String insertStudentDetails(int roll, String name, int marks) {
		
		String message = "Not inserted...";
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			
			PreparedStatement ps= conn.prepareStatement("insert into student values(?,?,?)"); 
			
			ps.setInt(1, roll);
			ps.setString(2, name);
			ps.setInt(3, marks);
			
			int x= ps.executeUpdate();
			
			if(x > 0)
				message = "Record Inserted Successfully..!";
			
			
			
			
		} catch (SQLException e) {
			message = e.getMessage();
		}
		
		
		
		return message;
		
	}

	@Override
	public String insertStudentDetails2(Student student) {
		
		
		String message = "Not inserted...";
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			
			PreparedStatement ps= conn.prepareStatement("insert into student values(?,?,?)"); 
			
			ps.setInt(1, student.getRoll());
			ps.setString(2, student.getName());
			ps.setInt(3, student.getMarks());
			
			int x= ps.executeUpdate();
			
			if(x > 0)
				message = "Record Inserted Successfully..!";
			
			
			
			
		} catch (SQLException e) {
			message = e.getMessage();
		}
		
		
		
		return message;
		
		
		
	}

}
