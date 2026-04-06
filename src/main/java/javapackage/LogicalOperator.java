package javapackage;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 5;
		int c = 20; 
		
		//Logical operator -the logical(&&) operator does not check second condition if first condition is false
		// it will print next line output
		System.out.println(a<b && b<c); // false & true
		 //false true = false
		// True false = false
		// True true = true
		//False False = False
		
		
		//Bitwise Operator - the bitwise (&) operator always check both condition wheather first condition true or false
		System.out.println(a<b & a<c); // false & true
		
		
		
	}

}
