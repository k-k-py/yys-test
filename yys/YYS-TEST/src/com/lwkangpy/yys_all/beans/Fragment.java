package com.lwkangpy.yys_all.beans;

import java.io.Serializable;
//碎片对象
public class Fragment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8854584588L;
	private Integer id;//碎片的主键
	private Hellspawn hellspawn;//碎片式神
	private int piece;//碎片的个数
	private Master master;//碎片的主人

	public Fragment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fragment( Hellspawn hellspawn, int piece, Master master) {
		super();
		this.hellspawn = hellspawn;
		this.piece = piece;
		this.master = master;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Hellspawn getHellspawn() {
		return hellspawn;
	}

	public void setHellspawn(Hellspawn hellspawn) {
		this.hellspawn = hellspawn;
	}

	public int getPiece() {
		return piece;
	}

	public void setPiece(int piece) {
		this.piece = piece;
	}

	public Master getMaster() {
		return master;
	}

	public void setMaster(Master master) {
		this.master = master;
	}

	@Override
	public String toString() {
		return "Fragment [id=" + id + ", hellspawn=" + hellspawn + ", piece=" + piece + "]";
	}

	

}
