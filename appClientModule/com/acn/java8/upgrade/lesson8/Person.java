package com.acn.java8.upgrade.lesson8;

public class Person {
	String name;
	Sex sex;
	int age;
	
	Person(String name, Sex sex){
		this.name = name;
		this.sex = sex;
	}
	
	Person(String name, Sex sex, int age){
		this(name, sex);
		this.age = age;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Name: " + name + " Sex: " + sex + " Age " + age;
	}
	
}