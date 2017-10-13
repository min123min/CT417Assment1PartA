package com.mycompany.assigment1;

import java.util.ArrayList;
import java.util.List;
public class module {
	private String name;
	private String id;
	private List<student> students;
	
	public module(String n, String id, List<student> studentsInClass){
		
		this.setName(n);
		this.setId(id);
		this.setStudents(studentsInClass);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<student> getStudents() {
		return students;
	}

	public void setStudents(List<student> students) {
		this.students = students;
	}
}