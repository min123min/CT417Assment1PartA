package com.mycompany.assigment1;

public class student {
	private String name;
	private int age;
	private String address;
	private String dob;
	private String id;
	private String username;
	
	public student(String n, int a, String add, String birth, String id){
		
		this.setName(n);
		this.setAge(a);
		this.setAddress(add);
		this.setDob(birth);
		this.setId(id);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getUsername(){
		this.username = this.name + this.age;
		return this.username;
	}

}
