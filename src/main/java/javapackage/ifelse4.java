package javapackage;

public class ifelse4 {
  // Nested if else statement
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		int age = 15;
		int weight = 50;
		// outer if block
		if (age > 18) { // age is not greater than 25 so condition is true so it will execute next statement
			// inner if block
			if (weight > 50) {
				System.out.println("eligible for blood donation");
			}
			else {
				System.out.println("Not eligible");
			}
		} else {
			System.out.println("must be greater than 18 years");
		}
		
	}

}
