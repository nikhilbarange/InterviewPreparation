package automationbyselenium;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestNGkeywordParameter {
	
	
	@Parameters({"i","j"})
	@Test
	public void additionOfTwoNumbers(int a,int b) {
		System.out.println(a+b);
	}

}
