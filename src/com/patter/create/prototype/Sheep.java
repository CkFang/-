package com.patter.create.prototype;

import java.io.Serializable;
import java.util.Date;

public class Sheep implements Cloneable,Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String sname;
	private Date birthday;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj = super.clone();
		
		//深复制
		Sheep s = (Sheep)obj;
		s.birthday = (Date) this.birthday.clone();
		return obj;
	}
	
	public Sheep() {
		super();
	}

	public Sheep(String sname, Date birthday) {
		super();
		this.sname = sname;
		this.birthday = birthday;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
}
