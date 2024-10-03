package com.studentmanagement.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class start {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		System.out.println("Welcome Student management App !!");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("Press 1 to ADD Student");
			System.out.println("Press 2 to Delete Student");
			System.out.println("Press 3 to Disply Student");
			System.out.println("Press 4 to exist  App");
			
			int c = Integer.parseInt(br.readLine());
			
			if (c == 1) {
				
				System.out.println("Please enter your name ");				
				String st_name =  br.readLine();
				
				System.out.println("Please enter your ID");
				int st_id = Integer.parseInt(br.readLine());
				
				System.out.println("Please enter your rollno.");
				int st_roll = Integer.parseInt(br.readLine());
				
				student st = new student(st_id, st_name, st_roll);
				boolean result = StudentDao.insertStudentToDB(st);
				
				System.out.println("Insert ===="+result);			
				
				System.out.println(st);
				
				
				
			} else if (c ==2){
				
				System.out.println("Please Student id to delete !!");
				int userid =  Integer.parseInt(br.readLine());
				boolean result = StudentDao.deleteStudent(userid);
				
				System.out.println("Delet ===="+result);
				
			} else if (c == 3) {
				
				StudentDao.ShowAllStudent();
				
			} else if (c == 4) {
				
				// exist
				break ;
				
			} else {
				
				
			}
						
		}
	
		System.out.println("Thankyou for using my Application ");
	}

}
