package com.mydevop.app;
import org.junit.*;
import org.junit.Test;
import static org.junit.Assert.*;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest 
{
	private App app;
	@Before
	public void setup() {	app=new App();}
	@Test
	public void appTest2(){Assert.assertEquals("One",app.toWords(1));}
	@Test
	public void appTest3(){Assert.assertEquals("Two", app.toWords(2));}
	@Test
	public void appTest4(){Assert.assertEquals("Three", app.toWords(3));}
	@Test
	public void appTest5(){Assert.assertEquals("Four", app.toWords(4));}
	@Test
	public void appTest6(){Assert.assertEquals("Five", app.toWords(5));}
	@Test
	public void appTest7(){Assert.assertEquals("Ten", app.toWords(10));}
	@Test
	public void appTest8(){Assert.assertEquals("Twenty Two", app.toWords(22));}
	@Test
	public void appTest9(){Assert.assertEquals("Ninety Nine", app.toWords(99));}
	@Test
	public void appTest10(){Assert.assertEquals("One Hundred", app.toWords(100));}
	@Test
	public void appTest11(){Assert.assertEquals("One Thousand One", app.toWords(1001));}
	@Test
	public void appTest12(){Assert.assertEquals("Nine Hundred Ninety Nine", app.toWords(999));}
	@Test
	public void appTest13(){Assert.assertEquals("One Lakh", app.toWords(100000));}
	@Test
	public void appTest14(){Assert.assertEquals("Ten Lakh", app.toWords(1000000));}
	@Test
	public void appTest15(){Assert.assertEquals("Nine Crore Ninety Nine Lakh Ninety Nine Thousand Nine Hundred Ninety Nine", app.toWords(99999999));}
	@Test
	public void appTest16(){Assert.assertEquals("Ninety Nine Crore Ninety Nine Lakh Ninety Nine Thousand Nine Hundred Ninety Nine", app.toWords(999999999));}
	@Test	
	public void appTest17(){Assert.assertEquals("One Hundred Crore", app.toWords(1000000000));}
	@Test
	public void numberOutOfRangeReturnsError() {Assert.assertEquals( "Error", app.toWords( -1 )) ;
 }
	
}