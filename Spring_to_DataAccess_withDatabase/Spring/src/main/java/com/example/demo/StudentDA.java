package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDA {
	Connection con;
	PreparedStatement pst;
	public List<Student> allstudent(){
		List<Student> sList=new ArrayList<>();
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost/springdb", "root", "nclc123456");
			
			pst=con.prepareStatement("select * from student");
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				sList.add(new Student(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4)));
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return sList;
	}
}
