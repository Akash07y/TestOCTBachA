package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClass2 {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before suite TestClass2");
	}
	
	@BeforeTest
	@Parameters("testData")
	public void beforeTest(String data) {
		System.out.println(data);
		System.out.println("before Test TestClass2");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("before class TestClass2 ");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method TestClass2 ");
	}
	
	@Test
	public void testC() {
		System.out.println("test C TestClass2");
	}
	
	@Test 
	public void testD() {
		System.out.println("test D TestClass2");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("after method TestClass2");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("after class TestClass2");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("after test TestClass2");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("after suite TestClass2");
	}
}
