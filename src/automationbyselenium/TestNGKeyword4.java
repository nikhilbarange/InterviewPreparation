package automationbyselenium;

import org.testng.annotations.Test;

public class TestNGKeyword4 {
	
	@Test(priority = 4,dependsOnMethods = "test2"	)
	public void test1() {
		System.out.println("Test 1");
	}
	
	@Test(priority = 3,timeOut = 5000)
	public void test2() throws InterruptedException {
		Thread.sleep(6000);
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
