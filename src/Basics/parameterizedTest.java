package Basics;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)

public class parameterizedTest {

	
	 private Integer inputNumber;
	   private Boolean expectedResult;
	   private checker evenOddChecker;

	   @Before
	   public void initialize() {
		   evenOddChecker = new checker();
	   }

	   // Each parameter should be placed as an argument here
	   // Every time runner triggers, it will pass the arguments
	   // from parameters we defined in primeNumbers() method
		
	   public parameterizedTest(Integer inputNumber, Boolean expectedResult) {
	      this.inputNumber = inputNumber;
	      this.expectedResult = expectedResult;
	   }

	   @Parameterized.Parameters
	   public static Collection evenodd() {
	      return Arrays.asList(new Object[][] {
	         { 2, true },
	         { 5, false },
	         { 18, true },
	         { 17, false },
	         { 14, true }
	      });
	   }

	   // This test will run 4 times since we have 5 parameters defined
	   @Test
	   public void testPrimeNumberChecker() {
	      System.out.println("Parameterized Number is : " + inputNumber);
	      assertEquals(expectedResult, 
	    		  evenOddChecker.validate(inputNumber));
	   }
}
