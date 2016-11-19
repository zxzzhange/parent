package com.zg.git.beans;

import java.io.Serializable;

public class User implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private String name;
	
	private Integer year;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}
	
}
