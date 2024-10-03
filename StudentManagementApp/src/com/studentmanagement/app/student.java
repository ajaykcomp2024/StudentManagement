package com.studentmanagement.app;

public class student {

	private int student_id;
	private String student_name;
	private int student_rollnum;
	
	public student(int student_id, String student_name, int student_rollnum) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.student_rollnum = student_rollnum;
	}

	public student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public int getStudent_rollnum() {
		return student_rollnum;
	}

	public void setStudent_rollnum(int student_rollnum) {
		this.student_rollnum = student_rollnum;
	}

	@Override
	public String toString() {
		return "student [student_id=" + student_id + ", student_name=" + student_name + ", student_rollnum="
				+ student_rollnum + "]";
	}
	
	
}
