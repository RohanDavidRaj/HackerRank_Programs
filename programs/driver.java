package com.hackerrank.programs;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

//Complete the code
public class driver
{
	public static void main(String[] args){
	
		
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(9, "rohan", 12.3));
		studentList.add(new Student(3, "rohan", 12.3));
		studentList.add(new Student(2, "king", 54.4));
		studentList.add(new Student(1, "divine", 24.3));
		
		
		
	 List<Student> collect = studentList.stream().sorted(Comparator
				.comparing(Student::getCgpa).reversed()
				.thenComparing(Student::getFname)
				.thenComparing(Student::getId)
				).collect(Collectors.toList());
				
     
		
	
      	for(Student st: collect){
			System.out.println(st.getId()+""+st.getFname()+" "+st.getCgpa()+" ");
		}
	}
}



