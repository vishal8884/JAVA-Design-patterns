package com.vishal.patterns.singleton;

public enum EnumSingleTonDemo {

	INSTANCE;

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
