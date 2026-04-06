package javapackage;

public class RelationalOperator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =300 ; 
		int b =300;
		
		if (a != b) {
			System.out.println("a is not equal to b");
		} else {
			System.out.println(" a is equal to b ");
		}
		
		String p = "seleNium CLAss";
		String q = "Selenium CLAss";
		
		// 1st way of string comparison is not correct , never compare string like this
		// we always use == for number comparison
		if (p==q) {
			System.out.println("p and q are equal for 1st way");
		}else {
			System.out.println("p and q are not equal for 1st way");
		}
	   
		//2nd way of string comparison is not appropriate
		if (p.equals(q)) {
			System.out.println("p and q are equal for 2nd way");
		}else {
			System.out.println(" p and q are not equal for 2nd way");
		}
		
		//3rd way of string comparison is correct way
		if (p.equalsIgnoreCase(q)) {
			System.out.println("p and q are equal for 3rd way");
		}else {
			System.out.println("p and q are not equal for 3rd way");
		}
			
		
	}

}
