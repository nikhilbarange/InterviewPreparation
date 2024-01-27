package automationbyselenium;

public class ErrorAndException {
	
  public static void calculator(int a,int b) {
	  System.out.println("Welcome to the calculator");
	  
	  try {
		  System.out.println(a/b);
	  }
	  catch (Exception e) {
		System.out.println("Enter valid inputs");
		e.printStackTrace();
	}
	  finally {
		  System.out.println("Thanks for using the calculator");
	  }
  }
  
  public static void main(String[] args) {
	calculator(20, 0);
}

}
