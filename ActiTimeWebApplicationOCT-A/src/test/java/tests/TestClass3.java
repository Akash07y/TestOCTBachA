package tests;

import org.junit.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass3 {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before suite TestClass3");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("before Test TestClass3");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("before class TestClass3 ");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method TestClass3 ");
	}
	
	@Test
	public void testB() {
		System.out.println("test B TestClass3");
	}
	
	@Test 
	public void testA() {
		System.out.println("test A TestClass3");
	}
	
	@Test
	public void testF() {
		System.out.println("test F TestClass3");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("after method TestClass3");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("after class TestClass3");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("after test TestClass3");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("after suite TestClass3");
	}

}
