package it.unipd.mtss;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntegerToRomanTest {

	@Test
	public void testConverti1()throws InputNumberException {
		//Arrange
		//Act
		String test1I = IntegerToRoman.converti(1);
		//Assert
		assertEquals("I", test1I );
		
	}
	@Test
	public void testConverti2() throws InputNumberException{
		//Arrange
		//Act
		String test2II = IntegerToRoman.converti(2);
		//Assert
		assertEquals("II", test2II );
		
	}
	
	@Test
	public void testConverti3() throws InputNumberException{
		//Arrange
		//Act
		String test3III = IntegerToRoman.converti(3);
		//Assert
		assertEquals("III", test3III );
		
	}
	
	@Test
	public void testConverti10()throws InputNumberException {
		//Arrange
		//Act
		String test5 = IntegerToRoman.converti(10);
		//Assert
		assertEquals("X", test5 );
		
	}
	
	@Test
	public void testConverti50() throws InputNumberException{
		//Arrange
		//Act
		String test6 = IntegerToRoman.converti(50);
		//Assert
		assertEquals("L", test6 );
		
	}
	@Test
	public void testConverti500() throws InputNumberException{
		//Arrange
		//Act
		String test7 = IntegerToRoman.converti(500);
		//Assert
		assertEquals("D", test7 );
		
	}
	
	@Test
	public void testConverti100()throws InputNumberException {
		//Arrange
		//Act
		String test8 = IntegerToRoman.converti(100);
		//Assert
		assertEquals("C", test8 );
		
	}
	
	
	@Test
	public void testConverti1000() throws InputNumberException{
		//Arrange
		//Act
		String test9= IntegerToRoman.converti(1000);
		//Assert
		assertEquals("M", test9 );
		
	}
	@Test
	public void testConverti999()throws InputNumberException {
		//Arrange
		//Act
		String test10= IntegerToRoman.converti(999);
		//Assert
		assertEquals("CMXCIX", test10 );
		
	}
	
	@Test 
	 public void testConverti200()throws InputNumberException {
		//Arrange
		//Act
	  	String test2CC = IntegerToRoman.converti(200); 
		//Assert
	  	assertEquals("CC", test2CC );
	 }
	@Test 
	 public void testConverti300()throws InputNumberException {
		//Arrange
		//Act
	  	String test3CC = IntegerToRoman.converti(300);
		//Assert
	    	assertEquals("CCC", test3CC );
	 }
	@Test 
	 public void testConverti400()throws InputNumberException { 
		//Arrange
		//Act
	  	String test4CD = IntegerToRoman.converti(400); 
		//Assert
	    	assertEquals("CD", test4CD );
	 }
	@Test 
	 public void testConverti600()throws InputNumberException { 
		//Arrange
		//Act
	  	String test6DC = IntegerToRoman.converti(600); 
		//Assert
	    	assertEquals("DC", test6DC );
	 }
	@Test 
	 public void testConverti700()throws InputNumberException { 
		//Arrange
		//Act
	  	String test7DCC = IntegerToRoman.converti(700); 
		//Assert
	    	assertEquals("DCC", test7DCC );
	 }
	@Test 
	 public void testConverti800()throws InputNumberException { 
		//Arrange
		//Act
	  	String test8DCCC = IntegerToRoman.converti(800); 
		//Assert
	    	assertEquals("DCCC", test8DCCC );
	 }
	
	
	@Test
	public void testCaso2XX()throws InputNumberException {
		//Arrange
		//Act
		String testCaso2XX= IntegerToRoman.converti(20);
		//Assert
		assertEquals("XX", testCaso2XX );
		
	}
	
	@Test
	public void testCaso3XXX()throws InputNumberException {
		//Arrange
		//Act
		String testCaso3XXX= IntegerToRoman.converti(30);
		//Assert
		assertEquals("XXX", testCaso3XXX);
		
	}
	
	@Test
	public void testCaso4XL()throws InputNumberException {
		//Arrange
		//Act
		String testCaso4XL= IntegerToRoman.converti(40);
		//Assert
		assertEquals("XL", testCaso4XL );
		
	}
	
	@Test
	public void testCaso6LX()throws InputNumberException {
		//Arrange
		//Act
		String testCaso6LX= IntegerToRoman.converti(60);
		//Assert
		assertEquals("LX", testCaso6LX );
		
	}
	
	@Test
	public void testCaso7LXX()throws InputNumberException {
		//Arrange
		//Act
		String testCaso7LXX= IntegerToRoman.converti(70);
		//Assert
		assertEquals("LXX", testCaso7LXX );
		
	}
	
	@Test
	public void testCaso8LXXX()throws InputNumberException {
		//Arrange
		//Act
		String testCaso8LXXX= IntegerToRoman.converti(80);
		//Assert
		assertEquals("LXXX", testCaso8LXXX );
		
	}
	
	@Test 
	 public void testConverti4()throws InputNumberException { 
		//Arrange
		//Act
	  	String test4IV = IntegerToRoman.converti(4); 
		//Assert
	    	assertEquals("IV", test4IV );
	 }
	@Test 
	 public void testConverti6()throws InputNumberException { 
		//Arrange
		//Act
	  	String test6VI = IntegerToRoman.converti(6); 
		//Assert
	    	assertEquals("VI", test6VI );
	 }
	@Test 
	 public void testConverti7()throws InputNumberException { 
		//Arrange
		//Act
	  	String test7VII = IntegerToRoman.converti(7); 
		//Assert
	    	assertEquals("VII", test7VII );
	 }
	@Test 
	 public void testConverti8()throws InputNumberException { 
		//Arrange
		//Act
	 	String test8VIII = IntegerToRoman.converti(8); 
		//Assert
	    	assertEquals("VIII", test8VIII );
	 }
	

	@Test(expected = InputNumberException.class)
	public void testConvertiIntervallo() throws InputNumberException {
		//Arrange
		//Act
		IntegerToRoman.converti(-5);
		//Assert
		//assertEquals("NUMERO INVALIDO", test11);
		 
	}
	

}
