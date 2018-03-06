package com.acn.java8.upgrade.lesson8;

public class Person {
	String name;
	Sex sex;
	
	Person(String name, Sex sex){
		this.name = name;
		this.sex = sex;
	}

	public Sex getGender() {
		return sex;
	}
	
	
	public String getName() {
		return name;
	}

	enum Sex {
		MALE, FEMALE;
	}
	
}