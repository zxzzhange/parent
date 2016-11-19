package com.zg.git.beans;

import java.io.Serializable;

public class MyClass implements Serializable{

	
	private static final long serialVersionUID = 1L;

	private int id;
	
	private String methoName;
	
	private String name;

	public MyClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyClass(String methoName, String name) {
		super();
		this.methoName = methoName;
		this.name = name;
	}

	public String getMethoName() {
		return methoName;
	}

	public void setMethoName(String methoName) {
		this.methoName = methoName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
