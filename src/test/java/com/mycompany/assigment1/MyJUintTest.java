package com.mycompany.assigment1;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyJUintTest extends TestCase {

	  private static student student;
	    
	    public MyJUintTest() {
	        
	    }
	    
	    @Before
	    public void setUp() {
	          student = new student("oisin", "curran","galway", "09-02-1995", 22, 14378786);
	    }
	    
	    @Test
	    public void testUsername(){
	       String name = student.getUsername();
	       String expectedResult = "oisincurran22";
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
