package Polymorphism;

public class Compiletime {
	static void sum(int a,int b) { //static method
		int c=a+b;
		System.out.println("Addition of two no :"+c);
	}
	static void sum(int a,int b,int e) {
		int c=a+b+e;
		System.out.println("Addition of three no :"+c);
	}
	public static void main(String[]args) {
		Compiletime.sum(121,13,10); 
		Compiletime.sum(12,13);
	
		
	}

}
//compile time poly can be achieve by using static method overloading