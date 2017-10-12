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
	    
	    @Before
	    public void setUp() {
	          student = new student("conor", "healy","Ballygar", "30-04-1996", 21, 14322261);
	    }
	    
	    @Test
	    public void testUsername(){
	       String name = student.getUsername();
	       String expectedResult = "conorhealy21";
	       System.out.println(name);
	       assertTrue(expectedResult.equals(name));
	       
	    }
	

		@After
	    public void tearDown() {
	    }

	    // TODO add test methods here.
	    // The methods must be annotated with annotation @Test. For example:
	    //
	    
	}