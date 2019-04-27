package com.lwkangpy.yysall.beans;

import java.io.Serializable;
import java.util.List;
//该系统所注册用户
public class User implements Serializable {
	private static final long serialVersionUID = 8854584585L;
	private Integer id;//用户主键
	private String userName;//用户名
	private String passWord;//用户密码
	private List<Master> masters;//用户所拥有的阴阳师账号

	public User() {

	}


	public User(String userName, String passWord) {
		super();
		this.userName = userName;
		this.passWord = passWord;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public List<Master> getMasters() {
		return masters;
	}

	public void setMasters(List<Master> masters) {
		this.masters = masters;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", passWord=" + passWord + "]";
	}

}
