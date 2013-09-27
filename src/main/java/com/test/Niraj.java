package com.test;

public class Niraj {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSize() {
		Integer size = 0;
		if (name != null) {
			size = name.length();
		}
		return size;
	}

}
