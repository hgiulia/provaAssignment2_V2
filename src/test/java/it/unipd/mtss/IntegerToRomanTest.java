package it.unipd.mtss;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntegerToRomanTest {

	@Test
	public void testConverti1()throws InputNumberException {
		String test1I = IntegerToRoman.converti(1);
		  assertEquals("I", test1I );
		
	}
	@Test
	public void testConverti2() throws InputNumberException{
		String test2II = IntegerToRoman.converti(2);
		  assertEquals("II", test2II );
		
	}
	
	@Test
	public void testConverti3() throws InputNumberException{
		String test3III = IntegerToRoman.converti(3);
		  assertEquals("III", test3III );
		
	}
	
	@Test
	public void testConverti10()throws InputNumberException {
		String test5 = IntegerToRoman.converti(10);
		  assertEquals("X", test5 );
		
	}
	
	@Test
	public void testConverti50() throws InputNumberException{
		String test6 = IntegerToRoman.converti(50);
		  assertEquals("L", test6 );
		
	}
	@Test
	public void testConverti500() throws InputNumberException{
		String test7 = IntegerToRoman.converti(500);
		  assertEquals("D", test7 );
		
	}
	
	@Test
	public void testConverti100()throws InputNumberException {
		String test8 = IntegerToRoman.converti(100);
		  assertEquals("C", test8 );
		
	}
	
	
	@Test
	public void testConverti1000() throws InputNumberException{
		String test9= IntegerToRoman.converti(1000);
		  assertEquals("M", test9 );
		
	}
	@Test
	public void testConverti999()throws InputNumberException {
		String test10= IntegerToRoman.converti(999);
		  assertEquals("CMXCIX", test10 );
		
	}
	
	@Test 
	 public void testConverti200()throws InputNumberException { 
	  String test2CC = IntegerToRoman.converti(200); 
	    assertEquals("CC", test2CC );
	 }
	@Test 
	 public void testConverti300()throws InputNumberException { 
	  String test3CC = IntegerToRoman.converti(300); 
	    assertEquals("CCC", test3CC );
	 }
	@Test 
	 public void testConverti400()throws InputNumberException { 
	  String test4CD = IntegerToRoman.converti(400); 
	    assertEquals("CD", test4CD );
	 }
	@Test 
	 public void testConverti600()throws InputNumberException { 
	  String test6DC = IntegerToRoman.converti(600); 
	    assertEquals("DC", test6DC );
	 }
	@Test 
	 public void testConverti700()throws InputNumberException { 
	  String test7DCC = IntegerToRoman.converti(700); 
	    assertEquals("DCC", test7DCC );
	 }
	@Test 
	 public void testConverti800()throws InputNumberException { 
	  String test8DCCC = IntegerToRoman.converti(800); 
	    assertEquals("DCCC", test8DCCC );
	 }
	
	
	@Test
	public void testCaso2XX()throws InputNumberException {
		String testCaso2XX= IntegerToRoman.converti(20);
		  assertEquals("XX", testCaso2XX );
		
	}
	
	@Test
	public void testCaso3XXX()throws InputNumberException {
		String testCaso3XXX= IntegerToRoman.converti(30);
		  assertEquals("XXX", testCaso3XXX);
		
	}
	
	@Test
	public void testCaso4XL()throws InputNumberException {
		String testCaso4XL= IntegerToRoman.converti(40);
		  assertEquals("XL", testCaso4XL );
		
	}
	
	@Test
	public void testCaso6LX()throws InputNumberException {
		String testCaso6LX= IntegerToRoman.converti(60);
		  assertEquals("LX", testCaso6LX );
		
	}
	
	@Test
	public void testCaso7LXX()throws InputNumberException {
		String testCaso7LXX= IntegerToRoman.converti(70);
		  assertEquals("LXX", testCaso7LXX );
		
	}
	
	@Test
	public void testCaso8LXXX()throws InputNumberException {
		String testCaso8LXXX= IntegerToRoman.converti(80);
		  assertEquals("LXXX", testCaso8LXXX );
		
	}
	
	@Test 
	 public void testConverti4()throws InputNumberException { 
	  String test4IV = IntegerToRoman.converti(4); 
	    assertEquals("IV", test4IV );
	 }
	@Test 
	 public void testConverti6()throws InputNumberException { 
	  String test6VI = IntegerToRoman.converti(6); 
	    assertEquals("VI", test6VI );
	 }
	@Test 
	 public void testConverti7()throws InputNumberException { 
	  String test7VII = IntegerToRoman.converti(7); 
	    assertEquals("VII", test7VII );
	 }
	@Test 
	 public void testConverti8()throws InputNumberException { 
	  String test8VIII = IntegerToRoman.converti(8); 
	    assertEquals("VIII", test8VIII );
	 }
	

	@Test(expected = InputNumberException.class)
	public void testConvertiIntervallo() throws InputNumberException {
		IntegerToRoman.converti(-5);
		// assertEquals("NUMERO INVALIDO", test11);
		 
	}
	

}
