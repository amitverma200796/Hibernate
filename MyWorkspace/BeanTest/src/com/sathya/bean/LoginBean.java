package com.sathya.bean;

public class LoginBean {
	private String uname,pwd;

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public boolean check()
	{
	if(uname.equals(pwd))
		return true;
	else
		return false;
	}
}
