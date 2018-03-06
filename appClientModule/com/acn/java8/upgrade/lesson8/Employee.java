package com.acn.java8.upgrade.lesson8;

public class Employee extends Person{
	Department department;
	
	Employee(String name, Sex sex, int age, Department department){
		super(name, sex, age);
		this.department = department;
	}
	
	enum Department {
		IT, Innovation, Sales, Investments;
	}
}
