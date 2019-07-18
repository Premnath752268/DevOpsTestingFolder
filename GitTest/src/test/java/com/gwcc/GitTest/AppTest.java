package com.gwcc.GitTest;

/*import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;*/
import org.testng.annotations.*;

/**
 * Unit test for simple App.
 */
public class AppTest
{
	@Test()
	public void ThirdMethod()
	{
		System.out.println("****** Hey , I am from  Third  Method ******");
	}
    
	@Test()
	public void SecondMethod()
	{
		System.out.println("****** I am from  Second Method ******");
	}
	
	@Test()
	public void FirstMethod()
	{
		System.out.println("****** Am from  First Method ******");
	}
	
	
	
	
}
