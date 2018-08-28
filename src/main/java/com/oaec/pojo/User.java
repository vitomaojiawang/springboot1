package com.oaec.pojo;

public class User {
	private int user_id;
	
	private String user_account;
	
	private String user_pwd;
	
	private String user_email;
	
	private String user_alive;
	
	private String user_lasttime;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_account() {
		return user_account;
	}

	public void setUser_account(String user_account) {
		this.user_account = user_account;
	}

	public String getUser_pwd() {
		return user_pwd;
	}

	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_alive() {
		return user_alive;
	}

	public void setUser_alive(String user_alive) {
		this.user_alive = user_alive;
	}

	public String getUser_lasttime() {
		return user_lasttime;
	}

	public void setUser_lasttime(String user_lasttime) {
		this.user_lasttime = user_lasttime;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_account=" + user_account + ", user_pwd=" + user_pwd
				+ ", user_email=" + user_email + ", user_alive=" + user_alive + ", user_lasttime=" + user_lasttime
				+ "]";
	}
	
	
	
	
	
}
