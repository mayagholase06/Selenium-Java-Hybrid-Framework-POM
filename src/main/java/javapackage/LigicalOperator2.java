package javapackage;

public class LigicalOperator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 5;
		int c = 20; 
		
		System.out.println(a<b && a++ < c); //false true
        System.out.println(a);//10
        
        
        System.out.println(a<b && a++ < c);// false True
        System.out.println(a);//11
		
	}

}
