package Basics;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitTest2 {

	
	@BeforeClass
	public static void beforeClass() {
			
			System.out.println("JunitTest2 beforeClass method executed");
		}
	@Before
	public void beforeMethod() {
		
		System.out.println("JunitTest2 beforeMethod");
	}
	
	@Test(expected=java.lang.ArithmeticException.class)
	public void testcase1() {
		int i=0;
		System.out.println(2/i);
		System.out.println("JunitTest2 testcase1 executed");
	}
}
 