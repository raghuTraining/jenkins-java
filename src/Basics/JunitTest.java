package Basics;


import static org.junit.Assert.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import junit.framework.TestCase;

public class JunitTest extends TestCase {

 int i; 
 int num;

   @Before
	public  void beforeClass1() {
	 i= 10;
	 num=6;
	String name= "ram"; 
	}
	
	@BeforeClass
	public static void beforeClass() {
		
	System.out.println("beforeClass method executed");

         //  driver.get(â€œ wwww.amazon.inâ€?);

		}
	
	@Before
	public void beforeMethod() {
		
		System.out.println("beforeMethod executed" );
		
	}
	
	@Test
	public void testcase1() { 
		
		
		System.out.println("testcase1 executed"+countTestCases());
		System.out.println("testcase1 executed"+getName());
		this.setName("unitTestcase");
		System.out.println("testcase1 executed"+getName());

	//	assertFalse(num>5);
		
	}
	
    @Test(timeout=500)
	public void testcase2() {
		
		System.out.println("testcase2 executed");
		//	assertEquals(10, i);
			
	}
    
    @After
    public void AfterMethod() {
		
		System.out.println("AfterMethod executed");
		
	}
    
    @AfterClass
    public static void afterClass() {
		
    	System.out.println("afterClass method executed");
    	
    		
    		}
    
}
