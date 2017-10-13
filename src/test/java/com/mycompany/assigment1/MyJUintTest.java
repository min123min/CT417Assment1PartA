package com.mycompany.assigment1;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyJUintTest extends TestCase {

	@Test
	public void testGetUsername(){
		
		student testStudent = new student("John", 21, "Galway", "01/01/1996", "ST12345");
		String expected = "John21";
		assertEquals(expected, testStudent.getUsername());
	}
}
