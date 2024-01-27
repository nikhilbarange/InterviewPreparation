package automationbyselenium;

import org.testng.annotations.Test;

public class TestNGKeywords {
	
	@Test(priority = 4)
	public void test1() {
		System.out.println("Test 1");
	}
	
	@Test(priority = 3)
	public void test2() {
		System.out.println("Test 2");
	}
	
	@Test(priority = 2)
	public void test3() {
		System.out.println("Test 3");
	}
	
	@Test(priority = 1)
	public void test4() {
		System.out.println("Test 4");
	}

}
