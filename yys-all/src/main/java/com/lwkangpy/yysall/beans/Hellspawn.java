package com.lwkangpy.yysall.beans;

import java.io.Serializable;
//式神对象
public class Hellspawn implements Serializable {
	private static final long serialVersionUID = 8854584587L;
	private Integer id;//式神的id
	private String hellspawnName;//式神的名字
	private String type;//式神的类型

	public Hellspawn() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hellspawn( String hellspawnName, String type) {
		super();
		this.hellspawnName = hellspawnName;
		this.type = type;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getHellspawnName() {
		return hellspawnName;
	}

	public void setHellspawnName(String hellspawnName) {
		this.hellspawnName = hellspawnName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Hellspawn [id=" + id + ", hellspawnName=" + hellspawnName + ", type=" + type + "]";
	}

}
