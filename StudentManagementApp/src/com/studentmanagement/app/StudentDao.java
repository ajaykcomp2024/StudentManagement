package com.studentmanagement.app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {

	public static boolean insertStudentToDB(student st) {

		boolean f = false;

		try {

			Connection con = CP.createc();
			String q = "insert into STUDENT (ID, NAME, ROLLNUMBER) VALUES (?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(q);

			pstmt.setInt(1, st.getStudent_id());
			pstmt.setString(2, st.getStudent_name());
			pstmt.setInt(3, st.getStudent_rollnum());

			pstmt.executeUpdate();

			return true;

		} catch (Exception e) {
			// TODO: handle exception
		}
		return f;

	}

	public static boolean deleteStudent(int userid) {
		// TODO Auto-generated method stub

		boolean f = false;

		try {

			Connection con = CP.createc();
			String q = "Delete from  STUDENT where ID = ?";
			PreparedStatement pstmt = con.prepareStatement(q);

			pstmt.setInt(1, userid);
			
			pstmt.executeUpdate();

			return true;

		} catch (Exception e) {
			// TODO: handle exception
		}
		return f;

	}

	public static void ShowAllStudent() {
		// TODO Auto-generated method stub

		try {

			Connection con = CP.createc();
			String q = "select * from  STUDENT";
			Statement stmt = con.createStatement();
			ResultSet set = stmt.executeQuery(q);				
			
			while(set.next()) {
				
				int id = set.getInt(1);
				String name =  set.getString(2);
				int rollno = set.getInt(3);
								
				System.out.println(id +"  "+ name + " "+ rollno);				
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
			
	}

}
