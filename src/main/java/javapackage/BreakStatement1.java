package javapackage;

public class BreakStatement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// outer loop 
		for (int i = 1; i < 3; i++) {
			
			// inner loop 
			for (int j = 1; j < 3; j++) {
				// If statement
				if (i == 2 && j == 2) {
					break;
				}
				System.out.println(i + "  " +j);
			}
		}
	}

}
