package Polymorphism;

public class Example1 {
	public void area() {
		System.out.println("find area");
	}
	public void area(int r) {
		System.out.println("area of circle :"+3.14*r*r);
	}
	public void area(int l,int b) {
		System.out.println("area of rect :"+l*b);
	}
	public void area(double h,double b) {
		System.out.println("area of triangle :"+0.5*b*h);
	}
	public static void main(String[]args) {
		Example1 e1=new Example1();//creating object
		e1.area();
		e1.area(4);
		e1.area(1.0, 2.0);
		e1.area(5, 5);
	}

}
