package automationbyselenium;

import org.testng.annotations.Test;

public class TestNGKeyword3 {
	
	@Test(priority = 4)
	public void test1() {
		System.out.println("Test 1");
	}
	
	@Test(priority = 3,enabled = false)
	public void test2() {
		System.out.println("Test 2");
	}
	
	@Test(priority = 2,timeOut = 4000)
	public void test3() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("Test 3");
	}
	
	@Test(priority = 1)
	public void test4() {
		System.out.println("Test 4");
	}

}
