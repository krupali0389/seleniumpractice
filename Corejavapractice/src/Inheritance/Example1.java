package Inheritance;
class A{
	void parent(){
		System.out.println("I am parent");
	}
	
}
class B {
	void child(){
		System.out.println("I am child");
	}
}
public class Example1 {
	

	public static void main(String[] args) {
		A e1=new A();
		e1. parent();
		B e2=new B();
		e2.child();
		
	}
}
