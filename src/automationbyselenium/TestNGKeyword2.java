package automationbyselenium;

import org.testng.annotations.Test;

public class TestNGKeyword2 {
		
		@Test(invocationCount = 2)
		public void test1() {
			System.out.println("Test 1");
		}
		
		@Test
		public void test2() {
			System.out.println("Test 2");
		}
		
		@Test
		public void test3() {
			System.out.println("Test 3");
		}
		
		@Test(invocationCount = 4)
		public void test4() {
			System.out.println("Test 4");
		}
	

}
