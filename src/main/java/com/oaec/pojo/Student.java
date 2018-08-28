package com.oaec.pojo;

public class Student {
	private String stu_name;
	private String stu_pwd;
	private String stu_score;
	private int age;
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return this.age;
	}

	public String getStu_name() {
		return stu_name;
	}
	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}
	public String getStu_pwd() {
		return stu_pwd;
	}
	public void setStu_pwd(String stu_pwd) {
		this.stu_pwd = stu_pwd;
	}
	public String getStu_score() {
		return stu_score;
	}
	public void setStu_score(String stu_score) {
		this.stu_score = stu_score;
	}
	
	
}
