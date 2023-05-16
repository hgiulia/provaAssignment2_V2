package it.unipd.mtss;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanPrinterTest {

	@Test
	public void testStampaI() throws InputNumberException{
		assertEquals("  _____ \r\n"
				+ " |_   _|\r\n"
				+ "   | |  \r\n"
				+ "   | |  \r\n"
				+ "  _| |_ \r\n"
				+ " |_____|\n",RomanPrinter.print(1));
	}
	@Test
	public void testStampaV() throws InputNumberException {
		assertEquals(" __      __\r\n"
				+ " \\ \\    / /\r\n"
				+ "  \\ \\  / / \r\n"
				+ "   \\ \\/ /  \r\n"
				+ "    \\  /   \r\n"
				+ "     \\/    \n",RomanPrinter.print(5));
	}
	@Test
	public void testStampaX() throws InputNumberException {
		assertEquals("__   __\r\n"
				+ " \\ \\ / /\r\n"
				+ "  \\ V / \r\n"
				+ "   > <  \r\n"
				+ "  / . \\ \r\n"
				+ " /_/ \\_\\\r\n"
				+ "        \n",RomanPrinter.print(10));
	}
	@Test
	public void testStampaD() throws InputNumberException {
		assertEquals("  _____  \r\n"
				+ " |  __ \\ \r\n"
				+ " | |  | |\r\n"
				+ " | |  | |\r\n"
				+ " | |__| |\r\n"
				+ " |_____/ \r\n"
				+ "         \n",RomanPrinter.print(500));
	}
	@Test
	public void testStampaM() throws InputNumberException {
		assertEquals("  __  __ \r\n"
				+ " |  \\/  |\r\n"
				+ " | \\  / |\r\n"
				+ " | |\\/| |\r\n"
				+ " | |  | |\r\n"
				+ " |_|  |_|\r\n"
				+ "         \n",RomanPrinter.print(1000));
	}
	@Test
	public void testStampaL() throws InputNumberException {
		assertEquals("  _      \r\n"
				+ " | |     \r\n"
				+ " | |     \r\n"
				+ " | |     \r\n"
				+ " | |____ \r\n"
				+ " |______|\r\n"
				+ "         \n",RomanPrinter.print(50));
	}
	@Test
	public void testStampaC() throws InputNumberException {
		assertEquals("   _____ \r\n"
				+ "  / ____|\r\n"
				+ " | |     \r\n"
				+ " | |     \r\n"
				+ " | |____ \r\n"
				+ "  \\_____|\n",RomanPrinter.print(100));
	}
	@Test
	public void testStampa2() throws InputNumberException {
		assertEquals("  _____ \r\n"
				+ " |_   _|\r\n"
				+ "   | |  \r\n"
				+ "   | |  \r\n"
				+ "  _| |_ \r\n"
				+ " |_____|\n"
				+ "  _____ \r\n"
				+ " |_   _|\r\n"
				+ "   | |  \r\n"
				+ "   | |  \r\n"
				+ "  _| |_ \r\n"
				+ " |_____|\n",RomanPrinter.print(2));
		
		
		
	}
	
}
