package com.inetbanking.testCases;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class RetryFailingTestCases {
	
	
	@Test
	public void TestMethod_1()
	{
		System.out.print("MY SUCCESS1");
		Assert.assertTrue(true);
		
	}
	@Test
	public void TestMethod_2()
	{
		System.out.print("MY SUCCESS2");
		Assert.assertTrue(true);
		
	}
	@Test
	public void TestMethod_3()
	{
		System.out.print("MY Fail1");
		Assert.assertTrue(false);
		
	}

}
