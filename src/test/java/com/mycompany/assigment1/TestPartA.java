package com.mycompany.assigment1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestPartA {

	  private static student student;
	    
	    public TestPartA() {
	        
	    }
	    
	    @Test
		public void testGetUsername(){
			
			student testStudent = new student("oisin", 22, "Galway", "09/02/1995", "14378786");
			String expected = "oisin22";
			assertEquals(expected, testStudent.getUsername());
		}

	    // TODO add test methods here.
	    // The methods must be annotated with annotation @Test. For example:
	    //
	    
	}