package javapackage;

public class Method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int c = methodA(15,30); // method call
     System.out.println(c);
    		 
	}
	public static int methodA(int n1, int n2) {
		if (n1>n2) {
			return n2; // return statement
		}else {
			return n1; //return statement
		}
	}
}
