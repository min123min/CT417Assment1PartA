package com.mycompany.assigment1;

import java.util.ArrayList;
public class module {
	 private String  ModName;     
	    private String ID; 
	    private ArrayList<student> Students;
	 
	   
	    public module(String Name, String last) {
	        this.ModName   = Name;
	        this.ID = ID;
	        Students = new ArrayList<student>();
	    }
	    public ArrayList<student> getstudents() {
	        return Students;
	    }
	    public void addStudent(student student){
	        this.Students.add(student);
	    }
	    
	    public String getID(){
	        return ID;
	    }
	    
	    public String getModuleName(){
	        return ModName;
	    }
	    
	    public void setID(String ID){
	        this.ID = ID;
	    }
	    
	    public void setName(String Name){
	        this.ModName = Name;
	    }
	    
	    public void removeStudent(student student){
	        this.Students.remove(student);
	    }
}
