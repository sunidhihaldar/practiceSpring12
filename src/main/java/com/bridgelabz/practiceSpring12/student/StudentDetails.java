package com.bridgelabz.practiceSpring12.student;

import java.util.Iterator;
import java.util.List;

public class StudentDetails {

	private String name;
	private List<Integer> marks;
	private Address address;
	
	public StudentDetails(String name,List<Integer> marks, Address address) {
		super();
		this.name = name;
		this.marks = marks;
		this.address = address;
	}

//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	public Address getAddress() {
//		return address;
//	}
//
//	public void setAddress(Address address) {
//		this.address = address;
//	}

	public void displayInfo() {
		System.out.println("Name: " + name + "Address: " + address.toString());
		System.out.println("Marks are: ");
		Iterator<Integer> itr = marks.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
	
}
