package com.lwkangpy.yys_all.beans;

import java.io.Serializable;
//阴阳寮对象
public class YYS_Society implements Serializable {
	private static final long serialVersionUID = 8854584583L;
	private Integer id;//阴阳寮主键
	private String societyName;//阴阳寮名字

	public YYS_Society() {
		super();
		// TODO Auto-generated constructor stub
	}

	public YYS_Society( String societyName) {
		super();
		this.societyName = societyName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSocietyName() {
		return societyName;
	}

	public void setSocietyName(String societyName) {
		this.societyName = societyName;
	}

	@Override
	public String toString() {
		return "YYS_Society [id=" + id + ", societyName=" + societyName + "]";
	}

}
