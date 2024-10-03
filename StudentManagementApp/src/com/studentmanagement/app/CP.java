package com.studentmanagement.app;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {

	public static Connection createc() {
		
		Connection con = null;
	
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","GIS_DEV","orcl");			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return con;
		
	}

}
