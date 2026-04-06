package javapackage;

public class Variable6 {
 
	int b = 10; // global variable
	static int c = 5; // static variable
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 Variable6 v6 = new Variable6(); // Object creation concept used here
	
	 System.out.println(v6.b); // 10
	 System.out.println(v6.c); //5
	 v6.a();
	}
	
	public void a() { // User defined method
		
		System.out.println("Hello Selenium");
	}

}
