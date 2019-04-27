package com.lwkangpy.yys_all.beans;

import java.io.Serializable;
import java.util.List;
//阴阳师账号对象
public class Master implements Serializable {
	private static final long serialVersionUID = 8854584586L;
	private Integer id;//阴阳师主键
	private String masterName;//阴阳师名字
	private int yys_Id;//阴阳师账号唯一id
	private User user;//系统注册用户的用户名
	private YYS_Society yYS_Society;//阴阳师所在的阴阳寮
	private List<Fragment> fragments;//阴阳师所拥有的碎片

	public Master() {

	}

	public Master( String masterName, int yys_Id, User user, YYS_Society yYS_Society) {
		super();
		this.masterName = masterName;
		this.yys_Id = yys_Id;
		this.user = user;
		this.yYS_Society = yYS_Society;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMasterName() {
		return masterName;
	}

	public void setMasterName(String masterName) {
		this.masterName = masterName;
	}

	public int getYys_Id() {
		return yys_Id;
	}

	public void setYys_Id(int yys_Id) {
		this.yys_Id = yys_Id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public YYS_Society getyYS_Society() {
		return yYS_Society;
	}

	public void setyYS_Society(YYS_Society yYS_Society) {
		this.yYS_Society = yYS_Society;
	}

	public List<Fragment> getFragments() {
		return fragments;
	}

	public void setFragments(List<Fragment> fragments) {
		this.fragments = fragments;
	}

	@Override
	public String toString() {
		return "Master [id=" + id + ", masterName=" + masterName + ", yys_Id=" + yys_Id + ", user=" + user
				+ ", yYS_Society=" + yYS_Society + ", fragments=" + fragments + "]";
	}

}
