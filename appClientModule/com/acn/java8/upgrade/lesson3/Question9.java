package com.acn.java8.upgrade.lesson3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question9 {

	public Question9() {
	}
	
	public static void main(String[] args) {
		List<Student> students = Arrays.asList(
			new Student("Anna", Student.Faculty.BUSISNESS),
			new Student("Brian", Student.Faculty.BUSISNESS),
			new Student("Chris", Student.Faculty.ENGINEERING),
			new Student("Dolores", Student.Faculty.ENGINEERING)
		);
		
		students.stream().collect(
				Collectors.partitioningBy(
					c -> c.getFaculty() == Student.Faculty.BUSISNESS))
						.forEach((k,v) -> System.out.println(k + " " + v)); // k + " " + v
		
	}
}

class Student {
	private String name;
	private Faculty faculty;
	
	public Student(String name, Faculty faculty) {
		this.name = name;
		this.faculty = faculty;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	static enum Faculty{
		BUSISNESS, ENGINEERING 
	}
	
	// Comment this and run 
	public String toString() {
		return name;
	}
}
