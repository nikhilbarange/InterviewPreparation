package automationbyselenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	
	@Test
	public void test1() {
		System.out.println("Test1");
	}
	
	@Test
	public void test2() {
		System.out.println("Test2");
	}
	
	@Test
	public void test3() {
		System.out.println("Test3");
	}
	
	@Test
	public void test4() {
		System.out.println("Test4");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class Method");
	}
	
	@AfterClass
	public void aferClass() {
		System.out.println("After Class Method");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test Method");
	}

}
