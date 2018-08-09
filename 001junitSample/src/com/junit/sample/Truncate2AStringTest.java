package com.junit.sample;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Truncate2AStringTest {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//		
//	}
	Truncate2AString t2as;
	@Test
	public void testTruncateAInFirstTwoPositionNegative()
	{
		System.out.println("inside +ve  Junit test");
		//arrange
		//Truncate2AString t2as=new Truncate2AString();
		String expectedOutput="B";
		String actualOutput;
		
		//act
		actualOutput=t2as.truncateAInFirstTwoPosition("BB");
		//System.out.println(actualOutput);
		//assert
		assertEquals(expectedOutput,actualOutput);
		
	}
/* any typical test will follow AAA rule/standard
	A-arrgange
	A-act
	A-assert*/
	
	@Before
	public void beforeEachJunitTest()
	{System.out.println("inside before");
		t2as=new Truncate2AString();
		System.out.println(t2as.getClass().getName()+"  created");
		
	}
	
	@After
	public void afterEachJunitTest()
	{
		System.out.println("inside after");
	}
	
	@BeforeClass
	public static void beforeJunitTestClass()
	{
		System.out.println("Before junit Test Class");
	}
	@AfterClass
	public static void afterEachJunitTestClass()
	{
		System.out.println("inside after Class");
	}
	
	@Test(timeout=50)
	public void checkRandomNumber()
	{
		long randomNumbers[]=new long[1000000];
		for(int i=0;i<1000000;i++)
		{
			randomNumbers[i]=(long)Math.random();
		}
	}

}
